package io.jking.tickster.button.impl.ticket;

import io.jking.tickster.button.ButtonContext;
import io.jking.tickster.button.IButton;
import io.jking.tickster.utility.EmbedFactory;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Emoji;
import net.dv8tion.jda.api.interactions.components.Button;
import net.dv8tion.jda.api.interactions.components.ButtonStyle;

public class YesCloseTicketButton implements IButton {

    @Override
    public void onButtonPress(ButtonContext context) {

        context.getInteraction().deferEdit().queue(hook -> {
            final EmbedBuilder embed = EmbedFactory.getDefault()
                    .setDescription("I am closing this ticket now! Click any of the button(s) below.")
                    .setFooter("Please note, this ticket will automatically delete 24 hours from now.");

            context.getChannel().upsertPermissionOverride(context.getMember())
                    .setDeny(Permission.MESSAGE_WRITE)
                    .queue(success -> hook.editOriginal("").setEmbeds(embed.build())
                            .setActionRow(
                                    Button.of(ButtonStyle.PRIMARY, "ticket_reopen", "Re-Open Ticket", Emoji.fromUnicode("\uD83D\uDD13")),
                                    Button.of(ButtonStyle.DANGER, "ticket_delete", "Delete Ticket", Emoji.fromUnicode("⚪")),
                                    Button.of(ButtonStyle.SECONDARY, "ticket_transcript", "Transcript", Emoji.fromUnicode("\uD83D\uDCDD"))
                            )
                            .queue()
                    );
        });
    }

    @Override
    public String buttonId() {
        return "yes:ticket_close";
    }
}