package pucp.gamesoft.dev.model;

import pucp.gamesoft.dev.model.opt.Genre;
import pucp.gamesoft.dev.model.opt.Platform;
import pucp.gamesoft.dev.model.opt.GameMode;

public class Game{
	private String name;
	private Genre genre;
	private Platform platform;
	private GameMode gameMode;
	private ContentClassificationSystem CCS;
	public Game(String name, Genre genre, Platform platform, GameMode gameMode, ContentClassificationSystem CCS){
		this.name = name;
		this.genre = genre;
		this.platform = platform;
		this.gameMode = gameMode;
		this.CCS = CCS;
	}
}