package com.palmergames.bukkit.towny.object;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Allows objects to contain townblocks to be accessed/manipulated. 
 * 
 * @author EdgarL
 * @author Shade
 * @author Suneet Tipirneni (Siris)
 */
public interface TownBlockOwner extends Permissible {

	/**
	 * Sets the townblocks
	 * 
	 * @param townBlocks the townblocks to set.
	 */
	void setTownblocks(List<TownBlock> townBlocks);

	/**
	 * Gets the townblocks.
	 * 
	 * @return The townblocks this object contains.
	 */
	@NotNull
	List<TownBlock> getTownBlocks();

	/**
	 * Checks whether object has townblock or not.
	 * 
	 * @param townBlock The townblock to check for.
	 * @return A boolean indicating if it was found or not.
	 */
	boolean hasTownBlock(TownBlock townBlock);

	/**
	 * Adds a townblock to the list of existing townblocks.
	 * 
	 * @param townBlock The townblock to add.
	 */
	void addTownBlock(TownBlock townBlock);

	/**
	 * Removes townblock from the list of existing townblocks.
	 * 
	 * @param townBlock The townblock to remove.
	 */
	void removeTownBlock(TownBlock townBlock);
}