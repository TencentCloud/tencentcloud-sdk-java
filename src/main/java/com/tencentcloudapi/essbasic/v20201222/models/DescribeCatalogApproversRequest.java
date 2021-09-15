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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCatalogApproversRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 目录ID
    */
    @SerializedName("CatalogId")
    @Expose
    private String CatalogId;

    /**
    * 查询指定用户是否为参与者,为空表示查询所有参与者
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 目录ID 
     * @return CatalogId 目录ID
     */
    public String getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set 目录ID
     * @param CatalogId 目录ID
     */
    public void setCatalogId(String CatalogId) {
        this.CatalogId = CatalogId;
    }

    /**
     * Get 查询指定用户是否为参与者,为空表示查询所有参与者 
     * @return UserId 查询指定用户是否为参与者,为空表示查询所有参与者
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 查询指定用户是否为参与者,为空表示查询所有参与者
     * @param UserId 查询指定用户是否为参与者,为空表示查询所有参与者
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribeCatalogApproversRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCatalogApproversRequest(DescribeCatalogApproversRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.CatalogId != null) {
            this.CatalogId = new String(source.CatalogId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

