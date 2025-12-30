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

public class SCFInstanceList extends AbstractModel {

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>SCF实例详情</p>
    */
    @SerializedName("InstanceList")
    @Expose
    private SCFInstanceDetail [] InstanceList;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
    * <p>地域下总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>SCF实例详情</p> 
     * @return InstanceList <p>SCF实例详情</p>
     */
    public SCFInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set <p>SCF实例详情</p>
     * @param InstanceList <p>SCF实例详情</p>
     */
    public void setInstanceList(SCFInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get <p>错误信息</p> 
     * @return Error <p>错误信息</p>
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set <p>错误信息</p>
     * @param Error <p>错误信息</p>
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * Get <p>地域下总数</p> 
     * @return TotalCount <p>地域下总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>地域下总数</p>
     * @param TotalCount <p>地域下总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public SCFInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCFInstanceList(SCFInstanceList source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceList != null) {
            this.InstanceList = new SCFInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new SCFInstanceDetail(source.InstanceList[i]);
            }
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "Error", this.Error);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

