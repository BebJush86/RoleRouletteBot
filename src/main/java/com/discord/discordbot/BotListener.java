package com.discord.discordbot;

import java.io.FileNotFoundException;
import java.net.*;
import java.util.Random;
import java.util.concurrent.TimeoutException;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.*;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class BotListener { // The event type in IListener<> can be any class which extends Event

    @EventSubscriber
    public void onMessageadd(MessageReceivedEvent event) throws FileNotFoundException, Exception, NullPointerException, TimeoutException, SocketTimeoutException {
        if (event.getMessage().getContent().startsWith("r.die") && (event.getChannel().getName().contains("insertchannelname"))) 
        {
            Random r = new Random();
            int Low = 1;
            int High = 7;
            int Result2 = r.nextInt(High - Low) + Low;
            if (Result2 == 1) {
                event.getChannel().sendMessage("The dice rolled 1.");
            } else if (Result2 == 2) {
                event.getChannel().sendMessage("The dice rolled 2.");
            } else if (Result2 == 3) {
                event.getChannel().sendMessage("The dice rolled 3.");
            } else if (Result2 == 4) {
                event.getChannel().sendMessage("The dice rolled 4.");
            } else if (Result2 == 5) {
                event.getChannel().sendMessage("The dice rolled 5.");
            } else if (Result2 == 6) {
                event.getChannel().sendMessage("The dice rolled 6.");
            }
        
        } else if (event.getMessage().getContent().startsWith("r.say") && (event.getChannel().getName().startsWith("insertchannelname"))) {
            IDiscordClient client = event.getClient();
            client.getGuildByID(421782178142093322L).getChannelByID(421782178142093324L).sendMessage(event.getMessage().getContent().replace("r.say", ""));
        }
    }
}
