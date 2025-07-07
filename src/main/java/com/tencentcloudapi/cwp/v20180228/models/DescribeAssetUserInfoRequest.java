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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetUserInfoRequest extends AbstractModel {

    /**
    * 云服务器UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机安全UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 账户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 云服务器UUID 
     * @return Quuid 云服务器UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 云服务器UUID
     * @param Quuid 云服务器UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机安全UUID 
     * @return Uuid 主机安全UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全UUID
     * @param Uuid 主机安全UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 账户名 
     * @return Name 账户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账户名
     * @param Name 账户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeAssetUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetUserInfoRequest(DescribeAssetUserInfoRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

