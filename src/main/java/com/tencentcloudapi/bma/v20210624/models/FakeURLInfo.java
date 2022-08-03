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

public class FakeURLInfo extends AbstractModel{

    /**
    * xxx
    */
    @SerializedName("FakeURLId")
    @Expose
    private Long FakeURLId;

    /**
    * xxx
    */
    @SerializedName("ProtectWeb")
    @Expose
    private String ProtectWeb;

    /**
    * xxx
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * xxx
    */
    @SerializedName("FakeURL")
    @Expose
    private String FakeURL;

    /**
    * xxx
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * xxx
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * xxx
    */
    @SerializedName("IPLoc")
    @Expose
    private String IPLoc;

    /**
    * xxx
    */
    @SerializedName("Heat")
    @Expose
    private Long Heat;

    /**
    * xxx
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * xxx
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * xxx
    */
    @SerializedName("FakeURLCompany")
    @Expose
    private String FakeURLCompany;

    /**
    * xxx
    */
    @SerializedName("FakeURLAttr")
    @Expose
    private String FakeURLAttr;

    /**
    * xxx
    */
    @SerializedName("FakeURLName")
    @Expose
    private String FakeURLName;

    /**
    * xxx
    */
    @SerializedName("FakeURLICP")
    @Expose
    private String FakeURLICP;

    /**
    * xxx
    */
    @SerializedName("FakeURLCreateTime")
    @Expose
    private String FakeURLCreateTime;

    /**
    * xxx
    */
    @SerializedName("FakeURLExpireTime")
    @Expose
    private String FakeURLExpireTime;

    /**
     * Get xxx 
     * @return FakeURLId xxx
     */
    public Long getFakeURLId() {
        return this.FakeURLId;
    }

    /**
     * Set xxx
     * @param FakeURLId xxx
     */
    public void setFakeURLId(Long FakeURLId) {
        this.FakeURLId = FakeURLId;
    }

    /**
     * Get xxx 
     * @return ProtectWeb xxx
     */
    public String getProtectWeb() {
        return this.ProtectWeb;
    }

    /**
     * Set xxx
     * @param ProtectWeb xxx
     */
    public void setProtectWeb(String ProtectWeb) {
        this.ProtectWeb = ProtectWeb;
    }

    /**
     * Get xxx 
     * @return DetectTime xxx
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set xxx
     * @param DetectTime xxx
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get xxx 
     * @return FakeURL xxx
     */
    public String getFakeURL() {
        return this.FakeURL;
    }

    /**
     * Set xxx
     * @param FakeURL xxx
     */
    public void setFakeURL(String FakeURL) {
        this.FakeURL = FakeURL;
    }

    /**
     * Get xxx 
     * @return Snapshot xxx
     */
    public String getSnapshot() {
        return this.Snapshot;
    }

    /**
     * Set xxx
     * @param Snapshot xxx
     */
    public void setSnapshot(String Snapshot) {
        this.Snapshot = Snapshot;
    }

    /**
     * Get xxx 
     * @return IP xxx
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set xxx
     * @param IP xxx
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get xxx 
     * @return IPLoc xxx
     */
    public String getIPLoc() {
        return this.IPLoc;
    }

    /**
     * Set xxx
     * @param IPLoc xxx
     */
    public void setIPLoc(String IPLoc) {
        this.IPLoc = IPLoc;
    }

    /**
     * Get xxx 
     * @return Heat xxx
     */
    public Long getHeat() {
        return this.Heat;
    }

    /**
     * Set xxx
     * @param Heat xxx
     */
    public void setHeat(Long Heat) {
        this.Heat = Heat;
    }

    /**
     * Get xxx 
     * @return Status xxx
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set xxx
     * @param Status xxx
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get xxx 
     * @return Note xxx
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set xxx
     * @param Note xxx
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get xxx 
     * @return FakeURLCompany xxx
     */
    public String getFakeURLCompany() {
        return this.FakeURLCompany;
    }

    /**
     * Set xxx
     * @param FakeURLCompany xxx
     */
    public void setFakeURLCompany(String FakeURLCompany) {
        this.FakeURLCompany = FakeURLCompany;
    }

    /**
     * Get xxx 
     * @return FakeURLAttr xxx
     */
    public String getFakeURLAttr() {
        return this.FakeURLAttr;
    }

    /**
     * Set xxx
     * @param FakeURLAttr xxx
     */
    public void setFakeURLAttr(String FakeURLAttr) {
        this.FakeURLAttr = FakeURLAttr;
    }

    /**
     * Get xxx 
     * @return FakeURLName xxx
     */
    public String getFakeURLName() {
        return this.FakeURLName;
    }

    /**
     * Set xxx
     * @param FakeURLName xxx
     */
    public void setFakeURLName(String FakeURLName) {
        this.FakeURLName = FakeURLName;
    }

    /**
     * Get xxx 
     * @return FakeURLICP xxx
     */
    public String getFakeURLICP() {
        return this.FakeURLICP;
    }

    /**
     * Set xxx
     * @param FakeURLICP xxx
     */
    public void setFakeURLICP(String FakeURLICP) {
        this.FakeURLICP = FakeURLICP;
    }

    /**
     * Get xxx 
     * @return FakeURLCreateTime xxx
     */
    public String getFakeURLCreateTime() {
        return this.FakeURLCreateTime;
    }

    /**
     * Set xxx
     * @param FakeURLCreateTime xxx
     */
    public void setFakeURLCreateTime(String FakeURLCreateTime) {
        this.FakeURLCreateTime = FakeURLCreateTime;
    }

    /**
     * Get xxx 
     * @return FakeURLExpireTime xxx
     */
    public String getFakeURLExpireTime() {
        return this.FakeURLExpireTime;
    }

    /**
     * Set xxx
     * @param FakeURLExpireTime xxx
     */
    public void setFakeURLExpireTime(String FakeURLExpireTime) {
        this.FakeURLExpireTime = FakeURLExpireTime;
    }

    public FakeURLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FakeURLInfo(FakeURLInfo source) {
        if (source.FakeURLId != null) {
            this.FakeURLId = new Long(source.FakeURLId);
        }
        if (source.ProtectWeb != null) {
            this.ProtectWeb = new String(source.ProtectWeb);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FakeURLId", this.FakeURLId);
        this.setParamSimple(map, prefix + "ProtectWeb", this.ProtectWeb);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
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

    }
}

