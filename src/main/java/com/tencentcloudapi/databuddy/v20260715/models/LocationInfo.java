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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocationInfo extends AbstractModel {

    /**
    * 存储位置名
    */
    @SerializedName("LocationName")
    @Expose
    private String LocationName;

    /**
    * 存储位置URI
    */
    @SerializedName("LocationUri")
    @Expose
    private String LocationUri;

    /**
    * 存储位置描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 存储位置属性
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * 审计信息
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
     * Get 存储位置名 
     * @return LocationName 存储位置名
     */
    public String getLocationName() {
        return this.LocationName;
    }

    /**
     * Set 存储位置名
     * @param LocationName 存储位置名
     */
    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }

    /**
     * Get 存储位置URI 
     * @return LocationUri 存储位置URI
     */
    public String getLocationUri() {
        return this.LocationUri;
    }

    /**
     * Set 存储位置URI
     * @param LocationUri 存储位置URI
     */
    public void setLocationUri(String LocationUri) {
        this.LocationUri = LocationUri;
    }

    /**
     * Get 存储位置描述 
     * @return Comment 存储位置描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 存储位置描述
     * @param Comment 存储位置描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 存储位置属性 
     * @return Properties 存储位置属性
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 存储位置属性
     * @param Properties 存储位置属性
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 审计信息 
     * @return Audit 审计信息
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set 审计信息
     * @param Audit 审计信息
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    public LocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocationInfo(LocationInfo source) {
        if (source.LocationName != null) {
            this.LocationName = new String(source.LocationName);
        }
        if (source.LocationUri != null) {
            this.LocationUri = new String(source.LocationUri);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationName", this.LocationName);
        this.setParamSimple(map, prefix + "LocationUri", this.LocationUri);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamObj(map, prefix + "Audit.", this.Audit);

    }
}

