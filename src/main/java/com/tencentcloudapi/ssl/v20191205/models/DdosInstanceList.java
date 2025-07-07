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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DdosInstanceList extends AbstractModel {

    /**
    * 该地域下ddos域名总数	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * ddos实例详情	
    */
    @SerializedName("InstanceList")
    @Expose
    private DdosInstanceDetail [] InstanceList;

    /**
    * 是否查询异常
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 该地域下ddos域名总数	 
     * @return TotalCount 该地域下ddos域名总数	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 该地域下ddos域名总数	
     * @param TotalCount 该地域下ddos域名总数	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get ddos实例详情	 
     * @return InstanceList ddos实例详情	
     */
    public DdosInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set ddos实例详情	
     * @param InstanceList ddos实例详情	
     */
    public void setInstanceList(DdosInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get 是否查询异常 
     * @return Error 是否查询异常
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 是否查询异常
     * @param Error 是否查询异常
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public DdosInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdosInstanceList(DdosInstanceList source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceList != null) {
            this.InstanceList = new DdosInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new DdosInstanceDetail(source.InstanceList[i]);
            }
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

