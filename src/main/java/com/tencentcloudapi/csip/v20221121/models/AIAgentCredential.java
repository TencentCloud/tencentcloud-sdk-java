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

public class AIAgentCredential extends AbstractModel {

    /**
    * <p>凭据 ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>凭据名称</p>
    */
    @SerializedName("CredName")
    @Expose
    private String CredName;

    /**
    * <p>凭据类型</p><p>枚举值：</p><ul><li>OAUTH： oauth 类型凭据</li><li>API_TOKEN： token 类型凭据</li><li>CLOUD_AK： aksk 类型凭据</li></ul>
    */
    @SerializedName("CredType")
    @Expose
    private String CredType;

    /**
    * <p>凭据所在位置标识</p>
    */
    @SerializedName("Locations")
    @Expose
    private AIAgentCredentialLocation [] Locations;

    /**
    * <p>最近扫描发现时间</p>
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * <p>该凭据的泄露位置总数</p>
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
     * Get <p>凭据 ID</p> 
     * @return ID <p>凭据 ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>凭据 ID</p>
     * @param ID <p>凭据 ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>凭据名称</p> 
     * @return CredName <p>凭据名称</p>
     */
    public String getCredName() {
        return this.CredName;
    }

    /**
     * Set <p>凭据名称</p>
     * @param CredName <p>凭据名称</p>
     */
    public void setCredName(String CredName) {
        this.CredName = CredName;
    }

    /**
     * Get <p>凭据类型</p><p>枚举值：</p><ul><li>OAUTH： oauth 类型凭据</li><li>API_TOKEN： token 类型凭据</li><li>CLOUD_AK： aksk 类型凭据</li></ul> 
     * @return CredType <p>凭据类型</p><p>枚举值：</p><ul><li>OAUTH： oauth 类型凭据</li><li>API_TOKEN： token 类型凭据</li><li>CLOUD_AK： aksk 类型凭据</li></ul>
     */
    public String getCredType() {
        return this.CredType;
    }

    /**
     * Set <p>凭据类型</p><p>枚举值：</p><ul><li>OAUTH： oauth 类型凭据</li><li>API_TOKEN： token 类型凭据</li><li>CLOUD_AK： aksk 类型凭据</li></ul>
     * @param CredType <p>凭据类型</p><p>枚举值：</p><ul><li>OAUTH： oauth 类型凭据</li><li>API_TOKEN： token 类型凭据</li><li>CLOUD_AK： aksk 类型凭据</li></ul>
     */
    public void setCredType(String CredType) {
        this.CredType = CredType;
    }

    /**
     * Get <p>凭据所在位置标识</p> 
     * @return Locations <p>凭据所在位置标识</p>
     */
    public AIAgentCredentialLocation [] getLocations() {
        return this.Locations;
    }

    /**
     * Set <p>凭据所在位置标识</p>
     * @param Locations <p>凭据所在位置标识</p>
     */
    public void setLocations(AIAgentCredentialLocation [] Locations) {
        this.Locations = Locations;
    }

    /**
     * Get <p>最近扫描发现时间</p> 
     * @return DetectTime <p>最近扫描发现时间</p>
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set <p>最近扫描发现时间</p>
     * @param DetectTime <p>最近扫描发现时间</p>
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get <p>该凭据的泄露位置总数</p> 
     * @return HitCount <p>该凭据的泄露位置总数</p>
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set <p>该凭据的泄露位置总数</p>
     * @param HitCount <p>该凭据的泄露位置总数</p>
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    public AIAgentCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentCredential(AIAgentCredential source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.CredName != null) {
            this.CredName = new String(source.CredName);
        }
        if (source.CredType != null) {
            this.CredType = new String(source.CredType);
        }
        if (source.Locations != null) {
            this.Locations = new AIAgentCredentialLocation[source.Locations.length];
            for (int i = 0; i < source.Locations.length; i++) {
                this.Locations[i] = new AIAgentCredentialLocation(source.Locations[i]);
            }
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "CredName", this.CredName);
        this.setParamSimple(map, prefix + "CredType", this.CredType);
        this.setParamArrayObj(map, prefix + "Locations.", this.Locations);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);

    }
}

