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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopProcessDaemonRequest extends AbstractModel {

    /**
    * <p>是否关闭全局 0 否 1 是</p>
    */
    @SerializedName("StopGlobal")
    @Expose
    private Long StopGlobal;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>不是全局的情况下关闭的quuid集合</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String [] Quuid;

    /**
     * Get <p>是否关闭全局 0 否 1 是</p> 
     * @return StopGlobal <p>是否关闭全局 0 否 1 是</p>
     */
    public Long getStopGlobal() {
        return this.StopGlobal;
    }

    /**
     * Set <p>是否关闭全局 0 否 1 是</p>
     * @param StopGlobal <p>是否关闭全局 0 否 1 是</p>
     */
    public void setStopGlobal(Long StopGlobal) {
        this.StopGlobal = StopGlobal;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>不是全局的情况下关闭的quuid集合</p> 
     * @return Quuid <p>不是全局的情况下关闭的quuid集合</p>
     */
    public String [] getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>不是全局的情况下关闭的quuid集合</p>
     * @param Quuid <p>不是全局的情况下关闭的quuid集合</p>
     */
    public void setQuuid(String [] Quuid) {
        this.Quuid = Quuid;
    }

    public StopProcessDaemonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopProcessDaemonRequest(StopProcessDaemonRequest source) {
        if (source.StopGlobal != null) {
            this.StopGlobal = new Long(source.StopGlobal);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String[source.Quuid.length];
            for (int i = 0; i < source.Quuid.length; i++) {
                this.Quuid[i] = new String(source.Quuid[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StopGlobal", this.StopGlobal);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Quuid.", this.Quuid);

    }
}

