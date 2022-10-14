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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportFakeURLInfo extends AbstractModel{

    /**
    * 仿冒网址ID
    */
    @SerializedName("FakeURLId")
    @Expose
    private Long FakeURLId;

    /**
    * 检测时间
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * 保护网站
    */
    @SerializedName("ProtectURL")
    @Expose
    private String ProtectURL;

    /**
    * 保护网站名称
    */
    @SerializedName("ProtectWeb")
    @Expose
    private String ProtectWeb;

    /**
    * 仿冒网址
    */
    @SerializedName("FakeURL")
    @Expose
    private String FakeURL;

    /**
    * 截图
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * IP地址
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * IP地理位置
    */
    @SerializedName("IPLoc")
    @Expose
    private String IPLoc;

    /**
    * 热度
    */
    @SerializedName("Heat")
    @Expose
    private Long Heat;

    /**
    * 网站状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 网站不处理原因
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 仿冒网站的企业名称
    */
    @SerializedName("FakeURLCompany")
    @Expose
    private String FakeURLCompany;

    /**
    * 仿冒网站的网站性质
    */
    @SerializedName("FakeURLAttr")
    @Expose
    private String FakeURLAttr;

    /**
    * 仿冒网站的网站名称
    */
    @SerializedName("FakeURLName")
    @Expose
    private String FakeURLName;

    /**
    * 仿冒网站的备案
    */
    @SerializedName("FakeURLICP")
    @Expose
    private String FakeURLICP;

    /**
    * 仿冒网站创建时间
    */
    @SerializedName("FakeURLCreateTime")
    @Expose
    private String FakeURLCreateTime;

    /**
    * 仿冒网站过期时间
    */
    @SerializedName("FakeURLExpireTime")
    @Expose
    private String FakeURLExpireTime;

    /**
    * 协查处置时间
    */
    @SerializedName("BlockTime")
    @Expose
    private String BlockTime;

    /**
     * Get 仿冒网址ID 
     * @return FakeURLId 仿冒网址ID
     */
    public Long getFakeURLId() {
        return this.FakeURLId;
    }

    /**
     * Set 仿冒网址ID
     * @param FakeURLId 仿冒网址ID
     */
    public void setFakeURLId(Long FakeURLId) {
        this.FakeURLId = FakeURLId;
    }

    /**
     * Get 检测时间 
     * @return DetectTime 检测时间
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set 检测时间
     * @param DetectTime 检测时间
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get 保护网站 
     * @return ProtectURL 保护网站
     */
    public String getProtectURL() {
        return this.ProtectURL;
    }

    /**
     * Set 保护网站
     * @param ProtectURL 保护网站
     */
    public void setProtectURL(String ProtectURL) {
        this.ProtectURL = ProtectURL;
    }

    /**
     * Get 保护网站名称 
     * @return ProtectWeb 保护网站名称
     */
    public String getProtectWeb() {
        return this.ProtectWeb;
    }

    /**
     * Set 保护网站名称
     * @param ProtectWeb 保护网站名称
     */
    public void setProtectWeb(String ProtectWeb) {
        this.ProtectWeb = ProtectWeb;
    }

    /**
     * Get 仿冒网址 
     * @return FakeURL 仿冒网址
     */
    public String getFakeURL() {
        return this.FakeURL;
    }

    /**
     * Set 仿冒网址
     * @param FakeURL 仿冒网址
     */
    public void setFakeURL(String FakeURL) {
        this.FakeURL = FakeURL;
    }

    /**
     * Get 截图 
     * @return Snapshot 截图
     */
    public String getSnapshot() {
        return this.Snapshot;
    }

    /**
     * Set 截图
     * @param Snapshot 截图
     */
    public void setSnapshot(String Snapshot) {
        this.Snapshot = Snapshot;
    }

    /**
     * Get IP地址 
     * @return IP IP地址
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP地址
     * @param IP IP地址
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get IP地理位置 
     * @return IPLoc IP地理位置
     */
    public String getIPLoc() {
        return this.IPLoc;
    }

    /**
     * Set IP地理位置
     * @param IPLoc IP地理位置
     */
    public void setIPLoc(String IPLoc) {
        this.IPLoc = IPLoc;
    }

    /**
     * Get 热度 
     * @return Heat 热度
     */
    public Long getHeat() {
        return this.Heat;
    }

    /**
     * Set 热度
     * @param Heat 热度
     */
    public void setHeat(Long Heat) {
        this.Heat = Heat;
    }

    /**
     * Get 网站状态 
     * @return Status 网站状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 网站状态
     * @param Status 网站状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 网站不处理原因 
     * @return Note 网站不处理原因
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 网站不处理原因
     * @param Note 网站不处理原因
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 仿冒网站的企业名称 
     * @return FakeURLCompany 仿冒网站的企业名称
     */
    public String getFakeURLCompany() {
        return this.FakeURLCompany;
    }

    /**
     * Set 仿冒网站的企业名称
     * @param FakeURLCompany 仿冒网站的企业名称
     */
    public void setFakeURLCompany(String FakeURLCompany) {
        this.FakeURLCompany = FakeURLCompany;
    }

    /**
     * Get 仿冒网站的网站性质 
     * @return FakeURLAttr 仿冒网站的网站性质
     */
    public String getFakeURLAttr() {
        return this.FakeURLAttr;
    }

    /**
     * Set 仿冒网站的网站性质
     * @param FakeURLAttr 仿冒网站的网站性质
     */
    public void setFakeURLAttr(String FakeURLAttr) {
        this.FakeURLAttr = FakeURLAttr;
    }

    /**
     * Get 仿冒网站的网站名称 
     * @return FakeURLName 仿冒网站的网站名称
     */
    public String getFakeURLName() {
        return this.FakeURLName;
    }

    /**
     * Set 仿冒网站的网站名称
     * @param FakeURLName 仿冒网站的网站名称
     */
    public void setFakeURLName(String FakeURLName) {
        this.FakeURLName = FakeURLName;
    }

    /**
     * Get 仿冒网站的备案 
     * @return FakeURLICP 仿冒网站的备案
     */
    public String getFakeURLICP() {
        return this.FakeURLICP;
    }

    /**
     * Set 仿冒网站的备案
     * @param FakeURLICP 仿冒网站的备案
     */
    public void setFakeURLICP(String FakeURLICP) {
        this.FakeURLICP = FakeURLICP;
    }

    /**
     * Get 仿冒网站创建时间 
     * @return FakeURLCreateTime 仿冒网站创建时间
     */
    public String getFakeURLCreateTime() {
        return this.FakeURLCreateTime;
    }

    /**
     * Set 仿冒网站创建时间
     * @param FakeURLCreateTime 仿冒网站创建时间
     */
    public void setFakeURLCreateTime(String FakeURLCreateTime) {
        this.FakeURLCreateTime = FakeURLCreateTime;
    }

    /**
     * Get 仿冒网站过期时间 
     * @return FakeURLExpireTime 仿冒网站过期时间
     */
    public String getFakeURLExpireTime() {
        return this.FakeURLExpireTime;
    }

    /**
     * Set 仿冒网站过期时间
     * @param FakeURLExpireTime 仿冒网站过期时间
     */
    public void setFakeURLExpireTime(String FakeURLExpireTime) {
        this.FakeURLExpireTime = FakeURLExpireTime;
    }

    /**
     * Get 协查处置时间 
     * @return BlockTime 协查处置时间
     */
    public String getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set 协查处置时间
     * @param BlockTime 协查处置时间
     */
    public void setBlockTime(String BlockTime) {
        this.BlockTime = BlockTime;
    }

    public ReportFakeURLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportFakeURLInfo(ReportFakeURLInfo source) {
        if (source.FakeURLId != null) {
            this.FakeURLId = new Long(source.FakeURLId);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.ProtectURL != null) {
            this.ProtectURL = new String(source.ProtectURL);
        }
        if (source.ProtectWeb != null) {
            this.ProtectWeb = new String(source.ProtectWeb);
        }
        if (source.FakeURL != null) {
            this.FakeURL = new String(source.FakeURL);
        }
        if (source.Snapshot != null) {
            this.Snapshot = new String(source.Snapshot);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.IPLoc != null) {
            this.IPLoc = new String(source.IPLoc);
        }
        if (source.Heat != null) {
            this.Heat = new Long(source.Heat);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.FakeURLCompany != null) {
            this.FakeURLCompany = new String(source.FakeURLCompany);
        }
        if (source.FakeURLAttr != null) {
            this.FakeURLAttr = new String(source.FakeURLAttr);
        }
        if (source.FakeURLName != null) {
            this.FakeURLName = new String(source.FakeURLName);
        }
        if (source.FakeURLICP != null) {
            this.FakeURLICP = new String(source.FakeURLICP);
        }
        if (source.FakeURLCreateTime != null) {
            this.FakeURLCreateTime = new String(source.FakeURLCreateTime);
        }
        if (source.FakeURLExpireTime != null) {
            this.FakeURLExpireTime = new String(source.FakeURLExpireTime);
        }
        if (source.BlockTime != null) {
            this.BlockTime = new String(source.BlockTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FakeURLId", this.FakeURLId);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "ProtectURL", this.ProtectURL);
        this.setParamSimple(map, prefix + "ProtectWeb", this.ProtectWeb);
        this.setParamSimple(map, prefix + "FakeURL", this.FakeURL);
        this.setParamSimple(map, prefix + "Snapshot", this.Snapshot);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "IPLoc", this.IPLoc);
        this.setParamSimple(map, prefix + "Heat", this.Heat);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "FakeURLCompany", this.FakeURLCompany);
        this.setParamSimple(map, prefix + "FakeURLAttr", this.FakeURLAttr);
        this.setParamSimple(map, prefix + "FakeURLName", this.FakeURLName);
        this.setParamSimple(map, prefix + "FakeURLICP", this.FakeURLICP);
        this.setParamSimple(map, prefix + "FakeURLCreateTime", this.FakeURLCreateTime);
        this.setParamSimple(map, prefix + "FakeURLExpireTime", this.FakeURLExpireTime);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);

    }
}

