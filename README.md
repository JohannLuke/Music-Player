# Java Music Player

A simple music player application built with Java, featuring a graphical user interface (GUI) using Swing and audio playback capabilities using the `javax.sound.sampled` package. This project allows users to play, pause, resume, restart, and switch between multiple audio tracks with a visually appealing interface.

## Features

- **Track Selection**: Choose from a list of 5 predefined audio tracks.
- **Playback Controls**: Play, pause, resume, restart, and navigate between tracks (next/previous).
- **Custom GUI**: Built with Swing, featuring rounded buttons and background images for each track.
- **Storage Options**: Supports loading tracks from two different directories (HDD or SSD).
- **Error Handling**: Basic exception handling for unsupported audio files, I/O errors, and line unavailability.

## Prerequisites

To run this project, you need the following:

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Audio Files**: WAV format audio files placed in the specified directories (see [File Structure](#file-structure)).
- **Images**: Background images for the front page, home page, and individual tracks (JPG format).

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/java-music-player.git
   cd java-music-player
   ```

2. **Set Up Audio and Image Files**:

- Place your `.wav` audio files and `.jpg` images in the appropriate directories as outlined in the [File Structure](#file-structure) section.
- Update the file paths in the code if your directory structure differs.

3. **Compile and Run**:
   
   ```bash
   javac Sample.java
   java Sample
   ```

## File Structure
The project expects the following directory structure:
  ```bash
     Johann\Java\Music Player\
     ├── Front Page.jpg          # Front page background
     ├── Home Page.jpg           # Track list background
     ├── 1. Bing Bing Boo_Music.wav
     ├── 1. Bing Bing Boo Last.jpg
     ├── 2. Heat Waves_Music.wav
     ├── 2. Heat Waves Last.jpg
     ├── 3. Illuminati_Music.wav
     ├── 3. Illuminati Last.jpg
     ├── 4. Perfect_Music.wav
     ├── 4. Perfect Last.jpg
     ├── 5. Wellerman_Music.wav
     ├── 5. Wellerman Last.jpg
     └── Extras\                 # SSD directory
         ├── 1. Bing Bing Boo_Music.wav
         ├── 2. Heat Waves_Music.wav
         ├── 3. Illuminati_Music.wav
         ├── 4. Perfect_Music.wav
         └── 5. Wellerman_Music.wav
  ```
Audio Files: Must be in .wav format.
Image Files: Must be in .jpg format and sized appropriately (resized in code to 535x540).

## Usage
1. **Launch the Application**
Run the main method in Sample.java.
The front page will appear, prompting you to choose between HDD or SSD storage.

2. **Select Storage**
Click "HDD" or "SSD" to load tracks from the respective directory.

3. **Choose a Track**
On the track list page, click a track button (1-5) to start playback.

4. **Control Playback**
Pause: Pause the current track.
Resume: Resume playback from the paused position.
Restart: Restart the current track from the beginning.
Next/Previous: Switch to the next or previous track in the list.
Home: Return to the track list page.

## Code Overview
Class: Sample
Key Methods:
front_page(): Displays the initial storage selection screen.
home_frame_hdd() / home_frame_ssd(): Displays the track list for HDD or SSD.
music(): Handles track playback and control UI.
play(), pause(), resume(), restart(): Audio control functions.
Dependencies: Uses javax.swing for GUI and javax.sound.sampled for audio.
Known Issues
Clip Management: The Clip object is static and reused, which may cause issues if not properly closed or reopened.
Path Dependency: Hardcoded file paths limit portability; consider using relative paths or a configuration file.
Resume Bug: Resuming a track may fail if the clip is not properly reinitialized.
Future Improvements
Add support for more audio formats (e.g., MP3) using external libraries.
Implement a playlist feature with dynamic track loading.
Improve portability by removing hardcoded file paths.
Add volume control and a progress bar.
