import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 
  
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sample
{
    static JFrame track_list,song;
    static JButton pause,resume,restart,next,prev,goto_home_page;
    static long current_frame;
    static int track_num;
    static Clip clip;

    public void home_frame_hdd() 
    {
        JFrame track_list = new JFrame();
        JButton track_1,track_2,track_3,track_4,track_5,back;

        track_1 = new JButton("");
        track_1.setBounds(22,295,38,38);
        track_1.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_1.setBorder(new RoundedBorder(38));
        track_1.setFocusable(false);
        track_1.setContentAreaFilled(false);
        track_1.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_1);

        track_2 = new JButton("");
        track_2.setBounds(22,343,38,38);
        track_2.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_2.setBorder(new RoundedBorder(38));
        track_2.setFocusable(false);
        track_2.setContentAreaFilled(false);
        track_2.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_2);

        track_3 = new JButton("");
        track_3.setBounds(22,390,38,38);
        track_3.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_3.setBorder(new RoundedBorder(38));
        track_3.setFocusable(false);
        track_3.setContentAreaFilled(false);
        track_3.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_3);

        track_4 = new JButton("");
        track_4.setBounds(22,439,38,38);
        track_4.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_4.setBorder(new RoundedBorder(38));
        track_4.setFocusable(false);
        track_4.setContentAreaFilled(false);
        track_4.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_4);

        track_5 = new JButton("");
        track_5.setBounds(22,486,38,38);
        track_5.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_5.setBorder(new RoundedBorder(38));
        track_5.setFocusable(false);
        track_5.setContentAreaFilled(false);
        track_5.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_5);

        back = new JButton("");
        back.setBounds(15,15,38,38);
        back.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        back.setBorder(new RoundedBorder(38));
        back.setFocusable(false);
        back.setContentAreaFilled(false);
        back.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(back);

        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                track_list.dispose();
                front_page();
            }
        });

        track_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_1 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo_Music.wav").getAbsoluteFile());
                    track_num = 1;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_1,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
            }
        });

        track_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_2 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\2. Heat Waves_Music.wav").getAbsoluteFile());
                    track_num = 2;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\2. Heat Waves Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_2,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
                //catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
            }
        });

        track_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_3 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\3. Illuminati_Music.wav").getAbsoluteFile());
                    track_num = 3;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\3. Illuminati Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_3,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
                //catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
            }
        });

        track_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_4 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\4. Perfect_Music.wav").getAbsoluteFile());
                    track_num = 4;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\4. Perfect Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_4,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
                //catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
            }
        });

        track_5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_5 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\5. Wellerman_Music.wav").getAbsoluteFile());
                    track_num = 5;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\5. Wellerman Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_5,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
                //catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
            }
        });

        ImageIcon original_icon = new ImageIcon("C:\\Johann\\Java\\Music Player\\Home Page.jpg");
        Image original_image = original_icon.getImage();

        Image resized_image = original_image.getScaledInstance(535, 540, Image.SCALE_SMOOTH);
        ImageIcon resized_icon = new ImageIcon(resized_image);
        JLabel image = new JLabel(resized_icon);
        image.setBounds(-3, 0, 540,540);
        track_list.add(image);

        track_list.setSize(551,579);
        track_list.setLayout(null);
        track_list.setLocationRelativeTo(null); //sets the frame at the centre of the screen
        track_list.setUndecorated(false); //removes the title bar
        track_list.setAlwaysOnTop(false);
        track_list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        track_list.setResizable(false);
        track_list.setVisible(true);
    }

    public void home_frame_ssd() 
    {
        JFrame track_list = new JFrame();
        JButton track_1,track_2,track_3,track_4,track_5,back;

        track_1 = new JButton("");
        track_1.setBounds(22,295,38,38);
        track_1.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_1.setBorder(new RoundedBorder(38));
        track_1.setFocusable(false);
        track_1.setContentAreaFilled(false);
        track_1.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_1);

        track_2 = new JButton("");
        track_2.setBounds(22,343,38,38);
        track_2.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_2.setBorder(new RoundedBorder(38));
        track_2.setFocusable(false);
        track_2.setContentAreaFilled(false);
        track_2.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_2);

        track_3 = new JButton("");
        track_3.setBounds(22,390,38,38);
        track_3.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_3.setBorder(new RoundedBorder(38));
        track_3.setFocusable(false);
        track_3.setContentAreaFilled(false);
        track_3.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_3);

        track_4 = new JButton("");
        track_4.setBounds(22,439,38,38);
        track_4.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_4.setBorder(new RoundedBorder(38));
        track_4.setFocusable(false);
        track_4.setContentAreaFilled(false);
        track_4.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_4);

        track_5 = new JButton("");
        track_5.setBounds(22,486,38,38);
        track_5.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        track_5.setBorder(new RoundedBorder(38));
        track_5.setFocusable(false);
        track_5.setContentAreaFilled(false);
        track_5.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(track_5);

        back = new JButton("");
        back.setBounds(15,15,38,38);
        back.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        back.setBorder(new RoundedBorder(38));
        back.setFocusable(false);
        back.setContentAreaFilled(false);
        back.setOpaque(false); //if false the image colour becomes bg colour of the button
        track_list.add(back);

        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                track_list.dispose();
                front_page();
            }
        });

        track_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_1 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\Extras\\1. Bing Bing Boo_Music.wav").getAbsoluteFile());
                    track_num = 1;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_1,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
            }
        });

        track_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_2 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\Extras\\2. Heat Waves_Music.wav").getAbsoluteFile());
                    track_num = 2;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\2. Heat Waves Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_2,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
                //catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
            }
        });

        track_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_3 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\Extras\\3. Illuminati_Music.wav").getAbsoluteFile());
                    track_num = 3;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\3. Illuminati Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_3,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
                //catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
            }
        });

        track_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_4 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\Extras\\4. Perfect_Music.wav").getAbsoluteFile());
                    track_num = 4;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\4. Perfect Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_4,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
                //catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
            }
        });

        track_5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                try
                {
                    AudioInputStream audio_5 = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\Extras\\5. Wellerman_Music.wav").getAbsoluteFile());
                    track_num = 5;
                    ImageIcon bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\5. Wellerman Last.jpg");
                    if(song != null && song.isActive())
                        song.dispose();
                    music(audio_5,bg,track_num);
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
                //catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
            }
        });

        ImageIcon original_icon = new ImageIcon("C:\\Johann\\Java\\Music Player\\Home Page.jpg");
        Image original_image = original_icon.getImage();

        Image resized_image = original_image.getScaledInstance(535, 540, Image.SCALE_SMOOTH);
        ImageIcon resized_icon = new ImageIcon(resized_image);
        JLabel image = new JLabel(resized_icon);
        image.setBounds(-3, 0, 540,540);
        track_list.add(image);

        track_list.setSize(551,579);
        track_list.setLayout(null);
        track_list.setLocationRelativeTo(null); //sets the frame at the centre of the screen
        track_list.setUndecorated(false); //removes the title bar
        track_list.setAlwaysOnTop(false);
        track_list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        track_list.setResizable(false);
        track_list.setVisible(true);
    }

    public static void play(Clip clip,AudioInputStream audio) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        if (clip.isActive() || clip.isOpen())
        {
            clip.stop();
            clip.close();
        }
        clip.open(audio);
        clip.start();
    }

    public static void pause(Clip clip)
    {
        current_frame = clip.getMicrosecondPosition(); 
        clip.stop();
    }

    public static void resume(Clip clip)
    {
        AudioInputStream audio = null;
        try
        {
            if (clip.isOpen())
            {
                clip.stop();
                clip.close(); // Close the clip before reopening it
            }
            if(track_num == 1)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo_Music.wav").getAbsoluteFile());
            else if(track_num == 2)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\2. Heat Waves_Music.wav").getAbsoluteFile());
            else if(track_num == 3)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\3. Illuminati_Music.wav").getAbsoluteFile());
            else if(track_num == 4)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\4. Perfect_Music.wav").getAbsoluteFile());
            else if(track_num == 5)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\5. Wellerman_Music.wav").getAbsoluteFile());
            clip.open(audio);
            clip.setMicrosecondPosition(current_frame); 
            clip.start();;
        }
        catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
        catch(IOException y) {System.out.println("IO Error");}
        catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
    }

    public static void restart(Clip clip)
    {
        AudioInputStream audio = null;
        try
        {
            if(track_num == 1)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo_Music.wav").getAbsoluteFile());
            else if(track_num == 2)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\2. Heat Waves_Music.wav").getAbsoluteFile());
            else if(track_num == 3)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\3. Illuminati_Music.wav").getAbsoluteFile());
            else if(track_num == 4)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\4. Perfect_Music.wav").getAbsoluteFile());
            else if(track_num == 5)
                audio = AudioSystem.getAudioInputStream
                    (new File("C:\\Johann\\Java\\Music Player\\5. Wellerman_Music.wav").getAbsoluteFile());
            play(clip,audio);
        }
        catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
        catch(IOException y) {System.out.println("IO Error");}
        catch(LineUnavailableException z) {System.out.println("Line Unavailable");}
    }

    public static void music(AudioInputStream aud, ImageIcon original_icon, int track_no)
    {
        JFrame song = new JFrame();

        goto_home_page = new JButton("");
        goto_home_page.setBounds(15,12,40,40);
        goto_home_page.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        goto_home_page.setBorder(new RoundedBorder(40));
        goto_home_page.setFocusable(false);
        goto_home_page.setContentAreaFilled(false);
        goto_home_page.setOpaque(false); //if false the image colour becomes bg colour of the button
        song.add(goto_home_page);

        prev = new JButton("");
        prev.setBounds(153,483,40,40);
        prev.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        prev.setBorder(new RoundedBorder(40));
        prev.setFocusable(false);
        prev.setContentAreaFilled(false);
        prev.setOpaque(false); //if false the image colour becomes bg colour of the button
        song.add(prev);

        resume = new JButton("");
        resume.setBounds(201,483,40,40);
        resume.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        resume.setBorder(new RoundedBorder(40));
        resume.setFocusable(false);
        resume.setContentAreaFilled(false);
        resume.setOpaque(false); //if false the image colour becomes bg colour of the button
        song.add(resume);

        pause = new JButton("");
        pause.setBounds(248,483,40,40);
        pause.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        pause.setBorder(new RoundedBorder(40));
        pause.setFocusable(false);
        pause.setContentAreaFilled(false);
        pause.setOpaque(false); //if false the image colour becomes bg colour of the button
        song.add(pause);

        next = new JButton("");
        next.setBounds(295,483,40,40);
        next.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        next.setBorder(new RoundedBorder(40));
        next.setFocusable(false);
        next.setContentAreaFilled(false);
        next.setOpaque(false); //if false the image colour becomes bg colour of the button
        song.add(next);     

        restart = new JButton("");
        restart.setBounds(341,483,40,40);
        restart.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        restart.setBorder(new RoundedBorder(40));
        restart.setFocusable(false);
        restart.setContentAreaFilled(false);
        restart.setOpaque(false); //if false the image colour becomes bg colour of the button
        song.add(restart); 
        
        goto_home_page.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                if(clip != null && clip.isActive())
                    clip.stop();
                song.dispose();
            }
        });

        pause.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                if (clip.isActive())
                   pause(clip); // Pass clip object to play method
            }
        });

        resume.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                if (clip.isActive() == false)
                   resume(clip); // Pass clip object to play method
            }
        });

        restart.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                restart(clip);
            }
        });

        prev.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                AudioInputStream audio = null;
                ImageIcon bg = null;
                if (track_num == 1)
                    track_num = 5;
                else
                    track_num--;
                try
                {
                    if(track_num == 1)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo Last.jpg");
                    }
                    else if(track_num == 2)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\2. Heat Waves_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\2. Heat Waves Last.jpg");
                    }
                    else if(track_num == 3)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\3. Illuminati_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\3. Illuminati Last.jpg");
                    }
                    else if(track_num == 4)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\4. Perfect_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\4. Perfect Last.jpg");
                    }
                    else if(track_num == 5)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\5. Wellerman_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\5. Wellerman Last.jpg");
                    }
                    song.dispose();
                    music(audio,bg,track_num);;
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
            }
        });

        next.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                AudioInputStream audio = null;
                ImageIcon bg = null;
                if (track_num == 5)
                    track_num = 1;
                else
                    track_num++;
                try
                {
                    if(track_num == 1)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\1. Bing Bing Boo Last.jpg");
                    }
                    else if(track_num == 2)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\2. Heat Waves_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\2. Heat Waves Last.jpg");
                    }
                    else if(track_num == 3)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\3. Illuminati_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\3. Illuminati Last.jpg");
                    }
                    else if(track_num == 4)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\4. Perfect_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\4. Perfect Last.jpg");
                    }
                    else if(track_num == 5)
                    {
                        audio = AudioSystem.getAudioInputStream
                            (new File("C:\\Johann\\Java\\Music Player\\5. Wellerman_Music.wav").getAbsoluteFile());
                        bg = new ImageIcon("C:\\Johann\\Java\\Music Player\\5. Wellerman Last.jpg");
                    }
                    song.dispose();
                    music(audio,bg,track_num);;
                }
                catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
                catch(IOException y) {System.out.println("IO Error");}
            }
        });

        Image original_image = original_icon.getImage();

        Image resized_image = original_image.getScaledInstance(535, 540, Image.SCALE_SMOOTH);
        ImageIcon resized_icon = new ImageIcon(resized_image);
        JLabel image = new JLabel(resized_icon);
        image.setBounds(-3, 0, 540,540);
        song.add(image);

        try
        {
            if (clip != null)
                play(clip, aud); // Pass clip object to play method
            else
            {
                clip = AudioSystem.getClip(); // Initialize clip if not already initialized
                play(clip, aud);
            }
        }
        catch(UnsupportedAudioFileException x) {System.out.println("Unsupported Audio File");}
        catch(IOException y) {System.out.println("IO Error");}
        catch(LineUnavailableException z) {System.out.println("Line Unavailable");}

        song.setSize(551,579);
        song.setLayout(null);
        song.setLocationRelativeTo(null); //sets the frame at the centre of the screen
        song.setUndecorated(false); //removes the title bar
        song.setAlwaysOnTop(false);
        song.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        song.setResizable(false);
        song.setVisible(true);
    }

    public void front_page()
    {
        JFrame front_frame = new JFrame();

        JButton hdd = new JButton("");  
        hdd.setBounds(77,280,158,39);
        hdd.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        hdd.setBorder(new RoundedBorder(40));
        hdd.setFocusable(false);
        hdd.setContentAreaFilled(false);
        hdd.setOpaque(false); //if false the image colour becomes bg colour of the button
        front_frame.add(hdd);

        JButton ssd = new JButton("");
        ssd.setBounds(77,333,158,39);
        ssd.setBorder(BorderFactory.createEmptyBorder()); //same as putting null(Doesn't make much of a difference)
        ssd.setBorder(new RoundedBorder(40));
        ssd.setFocusable(false);
        ssd.setContentAreaFilled(false);
        ssd.setOpaque(false); //if false the image colour becomes bg colour of the button
        front_frame.add(ssd);

        hdd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                front_frame.dispose();
                home_frame_hdd();
            }
        });

        ssd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click) 
            {
                front_frame.dispose();
                home_frame_ssd();
            }
        });

        ImageIcon original_icon = new ImageIcon("C:\\Johann\\Java\\Music Player\\Front Page.jpg");
        Image original_image = original_icon.getImage();

        Image resized_image = original_image.getScaledInstance(535, 540, Image.SCALE_SMOOTH);
        ImageIcon resized_icon = new ImageIcon(resized_image);
        JLabel image = new JLabel(resized_icon);
        image.setBounds(-3, 0, 540,540);
        front_frame.add(image);

        front_frame.setSize(551,579);
        front_frame.setLayout(null);
        front_frame.setLocationRelativeTo(null); //sets the frame at the centre of the screen
        front_frame.setUndecorated(false); //removes the title bar
        front_frame.setAlwaysOnTop(false);
        front_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        front_frame.setResizable(false);
        front_frame.setVisible(true);
    }
    public static void main(String args[])
    {
        Sample obj = new Sample();
        obj.front_page();
    }
}