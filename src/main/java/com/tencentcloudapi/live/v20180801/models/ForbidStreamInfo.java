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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForbidStreamInfo extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 创建时间。
注：此字段为北京时间（UTC+8时区）。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 禁推过期时间。
注：此字段为北京时间（UTC+8时区）。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 推流路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 创建时间。
注：此字段为北京时间（UTC+8时区）。 
     * @return CreateTime 创建时间。
注：此字段为北京时间（UTC+8时区）。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
注：此字段为北京时间（UTC+8时区）。
     * @param CreateTime 创建时间。
注：此字段为北京时间（UTC+8时区）。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 禁推过期时间。
注：此字段为北京时间（UTC+8时区）。 
     * @return ExpireTime 禁推过期时间。
注：此字段为北京时间（UTC+8时区）。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 禁推过期时间。
注：此字段为北京时间（UTC+8时区）。
     * @param ExpireTime 禁推过期时间。
注：此字段为北京时间（UTC+8时区）。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 推流路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName 推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName 推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 推流域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainName 推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainName 推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    public ForbidStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForbidStreamInfo(ForbidStreamInfo source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);

    }
}

