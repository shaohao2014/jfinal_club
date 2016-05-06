package win.yulongsun.jfinal_club.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("bill", "id", Bill.class);
		arp.addMapping("club", "id", Club.class);
		arp.addMapping("dict", "id", Dict.class);
		arp.addMapping("gtsafe_df", "id", GtsafeDf.class);
		arp.addMapping("member", "id", Member.class);
		arp.addMapping("user", "id", User.class);
	}
}

