package adhdmc.simplenicks.commands;

import adhdmc.simplenicks.util.SNPerm;
import org.bukkit.command.CommandSender;

import java.util.List;

public abstract class SubCommand {

    private final String name;
    private final String description;
    private final String syntax;
    private final SNPerm permission;

    public SubCommand(String name, String description, String syntax, SNPerm permission) {
        this.name = name;
        this.description = description;
        this.syntax = syntax;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSyntax() {
        return syntax;
    }

    public SNPerm getSimpleNickPermission() {
        return permission;
    }

    public String getPermission() {
        return permission.getPermission();
    }

    public abstract void execute(CommandSender sender, String[] args);

    public abstract List<String> getSubcommandArguments(CommandSender sender, String[] args);

}
