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

public class DescribeSealsRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 印章ID列表
    */
    @SerializedName("SealIds")
    @Expose
    private String [] SealIds;

    /**
    * 用户唯一标识
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
     * Get 印章ID列表 
     * @return SealIds 印章ID列表
     */
    public String [] getSealIds() {
        return this.SealIds;
    }

    /**
     * Set 印章ID列表
     * @param SealIds 印章ID列表
     */
    public void setSealIds(String [] SealIds) {
        this.SealIds = SealIds;
    }

    /**
     * Get 用户唯一标识 
     * @return UserId 用户唯一标识
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一标识
     * @param UserId 用户唯一标识
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribeSealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSealsRequest(DescribeSealsRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.SealIds != null) {
            this.SealIds = new String[source.SealIds.length];
            for (int i = 0; i < source.SealIds.length; i++) {
                this.SealIds[i] = new String(source.SealIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "SealIds.", this.SealIds);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

