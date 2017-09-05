Writer writer = null;

    try {
            writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("filename.html"), "utf-8"));
            writer.write("Something");
        } catch (IOException ex) {
            // report
        } finally {
           try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
