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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetWebLocationInfoRequest extends AbstractModel{

    /**
    * 服务器Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 服务器Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 站点Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 服务器Quuid 
     * @return Quuid 服务器Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器Quuid
     * @param Quuid 服务器Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 服务器Uuid 
     * @return Uuid 服务器Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器Uuid
     * @param Uuid 服务器Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 站点Id 
     * @return Id 站点Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 站点Id
     * @param Id 站点Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeAssetWebLocationInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetWebLocationInfoRequest(DescribeAssetWebLocationInfoRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

