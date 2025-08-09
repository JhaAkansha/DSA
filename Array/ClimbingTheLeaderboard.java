/*
An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:
    1. The player with the highest score is ranked number on the leaderboard.
    2. Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
*/

public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
 List<Integer> ranks = new ArrayList<>();
        ranked = new ArrayList<>(
                new LinkedHashSet<>(ranked)
        );
        int cpt = 0;
        Integer playerScore;
        for (int i = ranked.size()-1; i >= 0; i--) {
            int score = ranked.get(i);
            if(cpt==player.size()){
                break;
            }else{
                playerScore = player.get(cpt);
            }
            if(playerScore<score){
                ranks.add(i+2);
                i+=1;
                cpt+=1;
            }else if(playerScore==score){
                ranks.add(i+1);
                i+=1;
                cpt+=1;
            }else if(i == 0){
                i+=1;
                ranks.add(1);
                cpt+=1;
            }
        }
        return ranks;
    }
}
