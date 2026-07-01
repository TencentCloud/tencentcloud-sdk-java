/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPIntelInfo extends AbstractModel {

    /**
    * <p>情报标签（如常规木马、漏洞软件、窃密木马）</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>研判依据</p>
    */
    @SerializedName("Basis")
    @Expose
    private String Basis;

    /**
    * <p>所属运营商</p>
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * <p>地理位置</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * <p>家族团伙</p>
    */
    @SerializedName("Characteristic")
    @Expose
    private String Characteristic;

    /**
    * <p>IP画像</p>
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * <p>反查域名列表</p>
    */
    @SerializedName("Referer")
    @Expose
    private DomainInfo [] Referer;

    /**
     * Get <p>情报标签（如常规木马、漏洞软件、窃密木马）</p> 
     * @return Tags <p>情报标签（如常规木马、漏洞软件、窃密木马）</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>情报标签（如常规木马、漏洞软件、窃密木马）</p>
     * @param Tags <p>情报标签（如常规木马、漏洞软件、窃密木马）</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>研判依据</p> 
     * @return Basis <p>研判依据</p>
     */
    public String getBasis() {
        return this.Basis;
    }

    /**
     * Set <p>研判依据</p>
     * @param Basis <p>研判依据</p>
     */
    public void setBasis(String Basis) {
        this.Basis = Basis;
    }

    /**
     * Get <p>所属运营商</p> 
     * @return ISP <p>所属运营商</p>
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set <p>所属运营商</p>
     * @param ISP <p>所属运营商</p>
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get <p>地理位置</p> 
     * @return Location <p>地理位置</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>地理位置</p>
     * @param Location <p>地理位置</p>
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get <p>家族团伙</p> 
     * @return Characteristic <p>家族团伙</p>
     */
    public String getCharacteristic() {
        return this.Characteristic;
    }

    /**
     * Set <p>家族团伙</p>
     * @param Characteristic <p>家族团伙</p>
     */
    public void setCharacteristic(String Characteristic) {
        this.Characteristic = Characteristic;
    }

    /**
     * Get <p>IP画像</p> 
     * @return Purpose <p>IP画像</p>
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set <p>IP画像</p>
     * @param Purpose <p>IP画像</p>
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get <p>反查域名列表</p> 
     * @return Referer <p>反查域名列表</p>
     */
    public DomainInfo [] getReferer() {
        return this.Referer;
    }

    /**
     * Set <p>反查域名列表</p>
     * @param Referer <p>反查域名列表</p>
     */
    public void setReferer(DomainInfo [] Referer) {
        this.Referer = Referer;
    }

    public IPIntelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPIntelInfo(IPIntelInfo source) {
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Basis != null) {
            this.Basis = new String(source.Basis);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Characteristic != null) {
            this.Characteristic = new String(source.Characteristic);
        }
        if (source.Purpose != null) {
            this.Purpose = new String(source.Purpose);
        }
        if (source.Referer != null) {
            this.Referer = new DomainInfo[source.Referer.length];
            for (int i = 0; i < source.Referer.length; i++) {
                this.Referer[i] = new DomainInfo(source.Referer[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Basis", this.Basis);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Characteristic", this.Characteristic);
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);
        this.setParamArrayObj(map, prefix + "Referer.", this.Referer);

    }
}

