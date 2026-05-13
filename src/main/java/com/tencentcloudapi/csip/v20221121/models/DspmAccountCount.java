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

public class DspmAccountCount extends AbstractModel {

    /**
    * 云账号个数
    */
    @SerializedName("UinAccountCount")
    @Expose
    private Long UinAccountCount;

    /**
    * 访客账号个数
    */
    @SerializedName("PersonCount")
    @Expose
    private Long PersonCount;

    /**
    * 未管控账号个数
    */
    @SerializedName("UncontrolledAccountCount")
    @Expose
    private Long UncontrolledAccountCount;

    /**
    * 总账号个数
    */
    @SerializedName("TotalAccountCount")
    @Expose
    private Long TotalAccountCount;

    /**
     * Get 云账号个数 
     * @return UinAccountCount 云账号个数
     */
    public Long getUinAccountCount() {
        return this.UinAccountCount;
    }

    /**
     * Set 云账号个数
     * @param UinAccountCount 云账号个数
     */
    public void setUinAccountCount(Long UinAccountCount) {
        this.UinAccountCount = UinAccountCount;
    }

    /**
     * Get 访客账号个数 
     * @return PersonCount 访客账号个数
     */
    public Long getPersonCount() {
        return this.PersonCount;
    }

    /**
     * Set 访客账号个数
     * @param PersonCount 访客账号个数
     */
    public void setPersonCount(Long PersonCount) {
        this.PersonCount = PersonCount;
    }

    /**
     * Get 未管控账号个数 
     * @return UncontrolledAccountCount 未管控账号个数
     */
    public Long getUncontrolledAccountCount() {
        return this.UncontrolledAccountCount;
    }

    /**
     * Set 未管控账号个数
     * @param UncontrolledAccountCount 未管控账号个数
     */
    public void setUncontrolledAccountCount(Long UncontrolledAccountCount) {
        this.UncontrolledAccountCount = UncontrolledAccountCount;
    }

    /**
     * Get 总账号个数 
     * @return TotalAccountCount 总账号个数
     */
    public Long getTotalAccountCount() {
        return this.TotalAccountCount;
    }

    /**
     * Set 总账号个数
     * @param TotalAccountCount 总账号个数
     */
    public void setTotalAccountCount(Long TotalAccountCount) {
        this.TotalAccountCount = TotalAccountCount;
    }

    public DspmAccountCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAccountCount(DspmAccountCount source) {
        if (source.UinAccountCount != null) {
            this.UinAccountCount = new Long(source.UinAccountCount);
        }
        if (source.PersonCount != null) {
            this.PersonCount = new Long(source.PersonCount);
        }
        if (source.UncontrolledAccountCount != null) {
            this.UncontrolledAccountCount = new Long(source.UncontrolledAccountCount);
        }
        if (source.TotalAccountCount != null) {
            this.TotalAccountCount = new Long(source.TotalAccountCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UinAccountCount", this.UinAccountCount);
        this.setParamSimple(map, prefix + "PersonCount", this.PersonCount);
        this.setParamSimple(map, prefix + "UncontrolledAccountCount", this.UncontrolledAccountCount);
        this.setParamSimple(map, prefix + "TotalAccountCount", this.TotalAccountCount);

    }
}

