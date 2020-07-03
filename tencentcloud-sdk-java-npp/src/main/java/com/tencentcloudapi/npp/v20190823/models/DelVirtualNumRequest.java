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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DelVirtualNumRequest extends AbstractModel{

    /**
    * 业务appid
    */
    @SerializedName("BizAppId")
    @Expose
    private String BizAppId;

    /**
    * 双方号码 + 中间号绑定 ID，该 ID 全局唯一
    */
    @SerializedName("BindId")
    @Expose
    private String BindId;

    /**
    * 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。
    */
    @SerializedName("BizId")
    @Expose
    private String BizId;

    /**
     * Get 业务appid 
     * @return BizAppId 业务appid
     */
    public String getBizAppId() {
        return this.BizAppId;
    }

    /**
     * Set 业务appid
     * @param BizAppId 业务appid
     */
    public void setBizAppId(String BizAppId) {
        this.BizAppId = BizAppId;
    }

    /**
     * Get 双方号码 + 中间号绑定 ID，该 ID 全局唯一 
     * @return BindId 双方号码 + 中间号绑定 ID，该 ID 全局唯一
     */
    public String getBindId() {
        return this.BindId;
    }

    /**
     * Set 双方号码 + 中间号绑定 ID，该 ID 全局唯一
     * @param BindId 双方号码 + 中间号绑定 ID，该 ID 全局唯一
     */
    public void setBindId(String BindId) {
        this.BindId = BindId;
    }

    /**
     * Get 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。 
     * @return BizId 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。
     */
    public String getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。
     * @param BizId 应用二级业务 ID，bizId 需保证在该 appId 下全局唯一，最大长度不超过 16 个字节。
     */
    public void setBizId(String BizId) {
        this.BizId = BizId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizAppId", this.BizAppId);
        this.setParamSimple(map, prefix + "BindId", this.BindId);
        this.setParamSimple(map, prefix + "BizId", this.BizId);

    }
}

