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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeChatUserInfo extends AbstractModel{

    /**
    * 客户企业的corpid
    */
    @SerializedName("PaidCorpId")
    @Expose
    private String PaidCorpId;

    /**
    * 客户企业的Corp全称
    */
    @SerializedName("PaidCorpName")
    @Expose
    private String PaidCorpName;

    /**
     * Get 客户企业的corpid 
     * @return PaidCorpId 客户企业的corpid
     */
    public String getPaidCorpId() {
        return this.PaidCorpId;
    }

    /**
     * Set 客户企业的corpid
     * @param PaidCorpId 客户企业的corpid
     */
    public void setPaidCorpId(String PaidCorpId) {
        this.PaidCorpId = PaidCorpId;
    }

    /**
     * Get 客户企业的Corp全称 
     * @return PaidCorpName 客户企业的Corp全称
     */
    public String getPaidCorpName() {
        return this.PaidCorpName;
    }

    /**
     * Set 客户企业的Corp全称
     * @param PaidCorpName 客户企业的Corp全称
     */
    public void setPaidCorpName(String PaidCorpName) {
        this.PaidCorpName = PaidCorpName;
    }

    public WeChatUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeChatUserInfo(WeChatUserInfo source) {
        if (source.PaidCorpId != null) {
            this.PaidCorpId = new String(source.PaidCorpId);
        }
        if (source.PaidCorpName != null) {
            this.PaidCorpName = new String(source.PaidCorpName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaidCorpId", this.PaidCorpId);
        this.setParamSimple(map, prefix + "PaidCorpName", this.PaidCorpName);

    }
}

