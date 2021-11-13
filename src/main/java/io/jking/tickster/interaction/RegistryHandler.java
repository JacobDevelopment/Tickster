package io.jking.tickster.interaction;

import io.jking.tickster.interaction.impl.button.GarbageButton;
import io.jking.tickster.interaction.impl.button.ticket.*;
import io.jking.tickster.interaction.impl.selection.MenuCategoriesSelection;
import io.jking.tickster.interaction.impl.selection.MenuCategorySelection;
import io.jking.tickster.interaction.type.IButton;
import io.jking.tickster.interaction.type.ISelection;

public class RegistryHandler {

    private final RegistryMap<IButton> BUTTON_MAP = new RegistryMap<>();
    private final RegistryMap<ISelection> SELECTION_MAP = new RegistryMap<>();

    public RegistryHandler registerButtons() {
        BUTTON_MAP.put(new GarbageButton())
                .put(new CloseTicketButton())
                .put(new CreateTicketButton())
                .put(new DeleteTicketButton())
                .put(new NoCloseTicketButton())
                .put(new ReOpenTicketButton())
                .put(new TranscriptButton())
                .put(new YesCloseTicketButton());
        return this;
    }

    public RegistryHandler registerSelections() {
        SELECTION_MAP.put(new MenuCategoriesSelection()).put(new MenuCategorySelection());
        return this;
    }

    public IButton getButton(String componentId) {
        return BUTTON_MAP.get(componentId);
    }

    public ISelection getSelection(String componentId) {
        return SELECTION_MAP.get(componentId);
    }

}