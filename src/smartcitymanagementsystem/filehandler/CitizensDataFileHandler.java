package smartcitymanagementsystem.filehandler;

import smartcitymanagementsystem.citizens.Resident;
import smartcitymanagementsystem.citizens.Tourist;

import java.io.*;
import java.util.List;

public class CitizensDataFileHandler {

    public static void saveResidentDataToCSV(List<Resident> residents, String filename) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            String header = "id,name,phoneNo,residenceType";

            writer.write(header);


            writer.newLine();

            for (Resident resident : residents) {

                String data = resident.getCitizenId() + "," + resident.getName() + "," + resident.getContactInfo() + "," + resident.getResidenceType();

                writer.write(data);

                writer.newLine();

            }

            System.out.println("Resident Data written successfully");

        }

    }

    public static void  saveTouristDataToCSV(List<Tourist> tourists, String filename) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            String header = "id,name,phoneNo,touristId";

            writer.write(header);


            writer.newLine();

            for (Tourist tourist : tourists) {

                String data = tourist.getCitizenId() + "," + tourist.getName() + "," + tourist.getContactInfo() + "," + tourist.getTouristPassID();

                writer.write(data);

                writer.newLine();

            }

            System.out.println("Tourist Data written successfully");

        }

    }


//    public String loadDataFromCSVAndConvertToJSON(String csvFilename, String jsonFilename) throws IOException {
//
//        BufferedReader bufferedReader = null;
//        BufferedWriter bufferedWriter = null;
//
//        try {
//            bufferedReader = new BufferedReader(new FileReader(csvFilename));
//            bufferedWriter = new BufferedWriter(new FileWriter(jsonFilename));
//            JSONArray jsonArray = new JSONArray();
//            String jsonContent;
//            String line = bufferedReader.readLine();
//            String[] heading = line.split(",");
//
//            while ((line = bufferedReader.readLine()) != null) {
//                JSONObject jsonObject = new JSONObject();
//                String[] split = line.split(",");
//
//                for (int i = 0; i < split.length; i++) {
//
//                    jsonObject.put(heading[i], split[i]);
//
//                }
//                jsonArray.put(jsonObject);
//
//
//            }
//
//            bufferedWriter.write(jsonArray.toString(4));
//            bufferedWriter.close();
//
//            return jsonArray.toString(4);
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (JSONException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
