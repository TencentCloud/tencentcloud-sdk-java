/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultListItem extends AbstractModel{

    /**
    * banner广告软件标记，分别为-1-不确定，0-否，1-是
    */
    @SerializedName("Banner")
    @Expose
    private String Banner;

    /**
    * 精品推荐列表广告标记，分别为-1-不确定，0-否，1-是
    */
    @SerializedName("BoutiqueRecommand")
    @Expose
    private String BoutiqueRecommand;

    /**
    * 悬浮窗图标广告标记,分别为-1-不确定，0-否，1-是
    */
    @SerializedName("FloatWindows")
    @Expose
    private String FloatWindows;

    /**
    * 积分墙广告软件标记，分别为 -1 -不确定，0-否，1-是
    */
    @SerializedName("IntegralWall")
    @Expose
    private String IntegralWall;

    /**
    * 安装包的md5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 通知栏广告软件标记，分别为-1-不确定，0-否，1-是
    */
    @SerializedName("NotifyBar")
    @Expose
    private String NotifyBar;

    /**
    * 1表示官方，0表示非官方
    */
    @SerializedName("Official")
    @Expose
    private String Official;

    /**
    * 广告插件结果列表
    */
    @SerializedName("PluginList")
    @Expose
    private PluginListItem [] PluginList;

    /**
    * 非广告插件结果列表(SDK、风险插件等)
    */
    @SerializedName("OptPluginList")
    @Expose
    private OptPluginListItem [] OptPluginList;

    /**
    * 数字类型，分别为0-未知， 1-安全软件，2-风险软件，3-病毒软件
    */
    @SerializedName("SafeType")
    @Expose
    private String SafeType;

    /**
    * Session id，合作方可以用来区分回调数据，需要唯一。
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 安装包名称
    */
    @SerializedName("SoftName")
    @Expose
    private String SoftName;

    /**
    * 插播广告软件标记，取值：-1 不确定，0否， 1 是
    */
    @SerializedName("Spot")
    @Expose
    private String Spot;

    /**
    * 病毒名称，utf8编码
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 病毒描述，utf8编码
    */
    @SerializedName("VirusDesc")
    @Expose
    private String VirusDesc;

    /**
    * 二次打包状态：0-表示默认；1-表示二次
    */
    @SerializedName("RepackageStatus")
    @Expose
    private String RepackageStatus;

    /**
    * 应用错误码：0、1-表示正常；                  

2表示System Error(engine analysis error).

3表示App analysis error, please confirm it.

4表示App have not cert, please confirm it.

5表示App size is zero, please confirm it.

6表示App have not package name, please confirm it.

7表示App build time is empty, please confirm it.

8表示App have not valid cert, please confirm it.

99表示Other error.

1000表示App downloadlink download fail, please confirm it.

1001表示APP md5 different between real md5, please confirm it.

1002表示App md5 uncollect, please offer downloadlink.
    */
    @SerializedName("Errno")
    @Expose
    private String Errno;

    /**
    * 对应errno的错误信息描述
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get banner广告软件标记，分别为-1-不确定，0-否，1-是 
     * @return Banner banner广告软件标记，分别为-1-不确定，0-否，1-是
     */
    public String getBanner() {
        return this.Banner;
    }

    /**
     * Set banner广告软件标记，分别为-1-不确定，0-否，1-是
     * @param Banner banner广告软件标记，分别为-1-不确定，0-否，1-是
     */
    public void setBanner(String Banner) {
        this.Banner = Banner;
    }

    /**
     * Get 精品推荐列表广告标记，分别为-1-不确定，0-否，1-是 
     * @return BoutiqueRecommand 精品推荐列表广告标记，分别为-1-不确定，0-否，1-是
     */
    public String getBoutiqueRecommand() {
        return this.BoutiqueRecommand;
    }

    /**
     * Set 精品推荐列表广告标记，分别为-1-不确定，0-否，1-是
     * @param BoutiqueRecommand 精品推荐列表广告标记，分别为-1-不确定，0-否，1-是
     */
    public void setBoutiqueRecommand(String BoutiqueRecommand) {
        this.BoutiqueRecommand = BoutiqueRecommand;
    }

    /**
     * Get 悬浮窗图标广告标记,分别为-1-不确定，0-否，1-是 
     * @return FloatWindows 悬浮窗图标广告标记,分别为-1-不确定，0-否，1-是
     */
    public String getFloatWindows() {
        return this.FloatWindows;
    }

    /**
     * Set 悬浮窗图标广告标记,分别为-1-不确定，0-否，1-是
     * @param FloatWindows 悬浮窗图标广告标记,分别为-1-不确定，0-否，1-是
     */
    public void setFloatWindows(String FloatWindows) {
        this.FloatWindows = FloatWindows;
    }

    /**
     * Get 积分墙广告软件标记，分别为 -1 -不确定，0-否，1-是 
     * @return IntegralWall 积分墙广告软件标记，分别为 -1 -不确定，0-否，1-是
     */
    public String getIntegralWall() {
        return this.IntegralWall;
    }

    /**
     * Set 积分墙广告软件标记，分别为 -1 -不确定，0-否，1-是
     * @param IntegralWall 积分墙广告软件标记，分别为 -1 -不确定，0-否，1-是
     */
    public void setIntegralWall(String IntegralWall) {
        this.IntegralWall = IntegralWall;
    }

    /**
     * Get 安装包的md5 
     * @return Md5 安装包的md5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 安装包的md5
     * @param Md5 安装包的md5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 通知栏广告软件标记，分别为-1-不确定，0-否，1-是 
     * @return NotifyBar 通知栏广告软件标记，分别为-1-不确定，0-否，1-是
     */
    public String getNotifyBar() {
        return this.NotifyBar;
    }

    /**
     * Set 通知栏广告软件标记，分别为-1-不确定，0-否，1-是
     * @param NotifyBar 通知栏广告软件标记，分别为-1-不确定，0-否，1-是
     */
    public void setNotifyBar(String NotifyBar) {
        this.NotifyBar = NotifyBar;
    }

    /**
     * Get 1表示官方，0表示非官方 
     * @return Official 1表示官方，0表示非官方
     */
    public String getOfficial() {
        return this.Official;
    }

    /**
     * Set 1表示官方，0表示非官方
     * @param Official 1表示官方，0表示非官方
     */
    public void setOfficial(String Official) {
        this.Official = Official;
    }

    /**
     * Get 广告插件结果列表 
     * @return PluginList 广告插件结果列表
     */
    public PluginListItem [] getPluginList() {
        return this.PluginList;
    }

    /**
     * Set 广告插件结果列表
     * @param PluginList 广告插件结果列表
     */
    public void setPluginList(PluginListItem [] PluginList) {
        this.PluginList = PluginList;
    }

    /**
     * Get 非广告插件结果列表(SDK、风险插件等) 
     * @return OptPluginList 非广告插件结果列表(SDK、风险插件等)
     */
    public OptPluginListItem [] getOptPluginList() {
        return this.OptPluginList;
    }

    /**
     * Set 非广告插件结果列表(SDK、风险插件等)
     * @param OptPluginList 非广告插件结果列表(SDK、风险插件等)
     */
    public void setOptPluginList(OptPluginListItem [] OptPluginList) {
        this.OptPluginList = OptPluginList;
    }

    /**
     * Get 数字类型，分别为0-未知， 1-安全软件，2-风险软件，3-病毒软件 
     * @return SafeType 数字类型，分别为0-未知， 1-安全软件，2-风险软件，3-病毒软件
     */
    public String getSafeType() {
        return this.SafeType;
    }

    /**
     * Set 数字类型，分别为0-未知， 1-安全软件，2-风险软件，3-病毒软件
     * @param SafeType 数字类型，分别为0-未知， 1-安全软件，2-风险软件，3-病毒软件
     */
    public void setSafeType(String SafeType) {
        this.SafeType = SafeType;
    }

    /**
     * Get Session id，合作方可以用来区分回调数据，需要唯一。 
     * @return Sid Session id，合作方可以用来区分回调数据，需要唯一。
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set Session id，合作方可以用来区分回调数据，需要唯一。
     * @param Sid Session id，合作方可以用来区分回调数据，需要唯一。
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 安装包名称 
     * @return SoftName 安装包名称
     */
    public String getSoftName() {
        return this.SoftName;
    }

    /**
     * Set 安装包名称
     * @param SoftName 安装包名称
     */
    public void setSoftName(String SoftName) {
        this.SoftName = SoftName;
    }

    /**
     * Get 插播广告软件标记，取值：-1 不确定，0否， 1 是 
     * @return Spot 插播广告软件标记，取值：-1 不确定，0否， 1 是
     */
    public String getSpot() {
        return this.Spot;
    }

    /**
     * Set 插播广告软件标记，取值：-1 不确定，0否， 1 是
     * @param Spot 插播广告软件标记，取值：-1 不确定，0否， 1 是
     */
    public void setSpot(String Spot) {
        this.Spot = Spot;
    }

    /**
     * Get 病毒名称，utf8编码 
     * @return VirusName 病毒名称，utf8编码
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名称，utf8编码
     * @param VirusName 病毒名称，utf8编码
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 病毒描述，utf8编码 
     * @return VirusDesc 病毒描述，utf8编码
     */
    public String getVirusDesc() {
        return this.VirusDesc;
    }

    /**
     * Set 病毒描述，utf8编码
     * @param VirusDesc 病毒描述，utf8编码
     */
    public void setVirusDesc(String VirusDesc) {
        this.VirusDesc = VirusDesc;
    }

    /**
     * Get 二次打包状态：0-表示默认；1-表示二次 
     * @return RepackageStatus 二次打包状态：0-表示默认；1-表示二次
     */
    public String getRepackageStatus() {
        return this.RepackageStatus;
    }

    /**
     * Set 二次打包状态：0-表示默认；1-表示二次
     * @param RepackageStatus 二次打包状态：0-表示默认；1-表示二次
     */
    public void setRepackageStatus(String RepackageStatus) {
        this.RepackageStatus = RepackageStatus;
    }

    /**
     * Get 应用错误码：0、1-表示正常；                  

2表示System Error(engine analysis error).

3表示App analysis error, please confirm it.

4表示App have not cert, please confirm it.

5表示App size is zero, please confirm it.

6表示App have not package name, please confirm it.

7表示App build time is empty, please confirm it.

8表示App have not valid cert, please confirm it.

99表示Other error.

1000表示App downloadlink download fail, please confirm it.

1001表示APP md5 different between real md5, please confirm it.

1002表示App md5 uncollect, please offer downloadlink. 
     * @return Errno 应用错误码：0、1-表示正常；                  

2表示System Error(engine analysis error).

3表示App analysis error, please confirm it.

4表示App have not cert, please confirm it.

5表示App size is zero, please confirm it.

6表示App have not package name, please confirm it.

7表示App build time is empty, please confirm it.

8表示App have not valid cert, please confirm it.

99表示Other error.

1000表示App downloadlink download fail, please confirm it.

1001表示APP md5 different between real md5, please confirm it.

1002表示App md5 uncollect, please offer downloadlink.
     */
    public String getErrno() {
        return this.Errno;
    }

    /**
     * Set 应用错误码：0、1-表示正常；                  

2表示System Error(engine analysis error).

3表示App analysis error, please confirm it.

4表示App have not cert, please confirm it.

5表示App size is zero, please confirm it.

6表示App have not package name, please confirm it.

7表示App build time is empty, please confirm it.

8表示App have not valid cert, please confirm it.

99表示Other error.

1000表示App downloadlink download fail, please confirm it.

1001表示APP md5 different between real md5, please confirm it.

1002表示App md5 uncollect, please offer downloadlink.
     * @param Errno 应用错误码：0、1-表示正常；                  

2表示System Error(engine analysis error).

3表示App analysis error, please confirm it.

4表示App have not cert, please confirm it.

5表示App size is zero, please confirm it.

6表示App have not package name, please confirm it.

7表示App build time is empty, please confirm it.

8表示App have not valid cert, please confirm it.

99表示Other error.

1000表示App downloadlink download fail, please confirm it.

1001表示APP md5 different between real md5, please confirm it.

1002表示App md5 uncollect, please offer downloadlink.
     */
    public void setErrno(String Errno) {
        this.Errno = Errno;
    }

    /**
     * Get 对应errno的错误信息描述 
     * @return ErrMsg 对应errno的错误信息描述
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 对应errno的错误信息描述
     * @param ErrMsg 对应errno的错误信息描述
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public ResultListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultListItem(ResultListItem source) {
        if (source.Banner != null) {
            this.Banner = new String(source.Banner);
        }
        if (source.BoutiqueRecommand != null) {
            this.BoutiqueRecommand = new String(source.BoutiqueRecommand);
        }
        if (source.FloatWindows != null) {
            this.FloatWindows = new String(source.FloatWindows);
        }
        if (source.IntegralWall != null) {
            this.IntegralWall = new String(source.IntegralWall);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.NotifyBar != null) {
            this.NotifyBar = new String(source.NotifyBar);
        }
        if (source.Official != null) {
            this.Official = new String(source.Official);
        }
        if (source.PluginList != null) {
            this.PluginList = new PluginListItem[source.PluginList.length];
            for (int i = 0; i < source.PluginList.length; i++) {
                this.PluginList[i] = new PluginListItem(source.PluginList[i]);
            }
        }
        if (source.OptPluginList != null) {
            this.OptPluginList = new OptPluginListItem[source.OptPluginList.length];
            for (int i = 0; i < source.OptPluginList.length; i++) {
                this.OptPluginList[i] = new OptPluginListItem(source.OptPluginList[i]);
            }
        }
        if (source.SafeType != null) {
            this.SafeType = new String(source.SafeType);
        }
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.SoftName != null) {
            this.SoftName = new String(source.SoftName);
        }
        if (source.Spot != null) {
            this.Spot = new String(source.Spot);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.VirusDesc != null) {
            this.VirusDesc = new String(source.VirusDesc);
        }
        if (source.RepackageStatus != null) {
            this.RepackageStatus = new String(source.RepackageStatus);
        }
        if (source.Errno != null) {
            this.Errno = new String(source.Errno);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Banner", this.Banner);
        this.setParamSimple(map, prefix + "BoutiqueRecommand", this.BoutiqueRecommand);
        this.setParamSimple(map, prefix + "FloatWindows", this.FloatWindows);
        this.setParamSimple(map, prefix + "IntegralWall", this.IntegralWall);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "NotifyBar", this.NotifyBar);
        this.setParamSimple(map, prefix + "Official", this.Official);
        this.setParamArrayObj(map, prefix + "PluginList.", this.PluginList);
        this.setParamArrayObj(map, prefix + "OptPluginList.", this.OptPluginList);
        this.setParamSimple(map, prefix + "SafeType", this.SafeType);
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "SoftName", this.SoftName);
        this.setParamSimple(map, prefix + "Spot", this.Spot);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "VirusDesc", this.VirusDesc);
        this.setParamSimple(map, prefix + "RepackageStatus", this.RepackageStatus);
        this.setParamSimple(map, prefix + "Errno", this.Errno);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

