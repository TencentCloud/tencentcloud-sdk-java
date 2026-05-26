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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BinlogInfo extends AbstractModel {

    /**
    * 日志服务的唯一 ID
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 日志服务的类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例的唯一 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 日志服务的唯一 ID 
     * @return Sid 日志服务的唯一 ID
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 日志服务的唯一 ID
     * @param Sid 日志服务的唯一 ID
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 日志服务的类型 
     * @return Type 日志服务的类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 日志服务的类型
     * @param Type 日志服务的类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例的唯一 ID 
     * @return InstanceId 实例的唯一 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例的唯一 ID
     * @param InstanceId 实例的唯一 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public BinlogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogInfo(BinlogInfo source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

