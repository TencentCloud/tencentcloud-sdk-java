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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterPrintKey extends AbstractModel{

    /**
    * 密钥版本号
    */
    @SerializedName("KeyVersion")
    @Expose
    private String KeyVersion;

    /**
    * 密钥内容
    */
    @SerializedName("KeyContent")
    @Expose
    private String KeyContent;

    /**
    * 密钥ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥启用状态，只有一个取值1(启用)
    */
    @SerializedName("KeyOpenStatus")
    @Expose
    private Long KeyOpenStatus;

    /**
    * 密钥生成时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 密钥版本号 
     * @return KeyVersion 密钥版本号
     */
    public String getKeyVersion() {
        return this.KeyVersion;
    }

    /**
     * Set 密钥版本号
     * @param KeyVersion 密钥版本号
     */
    public void setKeyVersion(String KeyVersion) {
        this.KeyVersion = KeyVersion;
    }

    /**
     * Get 密钥内容 
     * @return KeyContent 密钥内容
     */
    public String getKeyContent() {
        return this.KeyContent;
    }

    /**
     * Set 密钥内容
     * @param KeyContent 密钥内容
     */
    public void setKeyContent(String KeyContent) {
        this.KeyContent = KeyContent;
    }

    /**
     * Get 密钥ID 
     * @return KeyId 密钥ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥ID
     * @param KeyId 密钥ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥启用状态，只有一个取值1(启用) 
     * @return KeyOpenStatus 密钥启用状态，只有一个取值1(启用)
     */
    public Long getKeyOpenStatus() {
        return this.KeyOpenStatus;
    }

    /**
     * Set 密钥启用状态，只有一个取值1(启用)
     * @param KeyOpenStatus 密钥启用状态，只有一个取值1(启用)
     */
    public void setKeyOpenStatus(Long KeyOpenStatus) {
        this.KeyOpenStatus = KeyOpenStatus;
    }

    /**
     * Get 密钥生成时间 
     * @return CreateTime 密钥生成时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 密钥生成时间
     * @param CreateTime 密钥生成时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public WaterPrintKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterPrintKey(WaterPrintKey source) {
        if (source.KeyVersion != null) {
            this.KeyVersion = new String(source.KeyVersion);
        }
        if (source.KeyContent != null) {
            this.KeyContent = new String(source.KeyContent);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyOpenStatus != null) {
            this.KeyOpenStatus = new Long(source.KeyOpenStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyVersion", this.KeyVersion);
        this.setParamSimple(map, prefix + "KeyContent", this.KeyContent);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyOpenStatus", this.KeyOpenStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

