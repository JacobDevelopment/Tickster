package io.jking.tickster.interaction.command.impl.utility;

import io.jking.tickster.interaction.command.AbstractCommand;
import io.jking.tickster.interaction.command.CommandCategory;
import io.jking.tickster.interaction.command.CommandRegistry;
import io.jking.tickster.interaction.core.impl.SlashSender;
import io.jking.tickster.interaction.core.responses.Error;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.interactions.commands.OptionType;

public class HelpCommand extends AbstractCommand {

    private final CommandRegistry registry;

    public HelpCommand(CommandRegistry registry) {
        super("help", "Displays permitted commands.", CommandCategory.UTILITY);
        addOption(OptionType.STRING, "input", "Command name/category.", false);
        this.registry = registry;
    }

    @Override
    public void onSlashCommand(SlashSender sender) {
        final String input = sender.getStringOption("input");
        if (input == null) {
            sendCategoriesMenu(CommandCategory.categories, sender.getMember());
            return;
        }

        final CommandCategory category = CommandCategory.getCategoryByName(input);
        if (category != null) {
            sendCategoryMenu(category, sender.getMember());
            return;
        }

        final AbstractCommand command = registry.get(input);
        if (command == null) {
            sender.replyErrorEphemeral(Error.CUSTOM, "You provided an invalid command name.").queue();
            return;
        }

        sendCommandInfo(command);
    }

    private void sendCommandInfo(AbstractCommand command) {
    }

    private void sendCategoryMenu(CommandCategory category, Member member) {
    }

    private void sendCategoriesMenu(CommandCategory[] categories, Member member) {
    }


}