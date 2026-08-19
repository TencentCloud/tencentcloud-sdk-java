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

public class ModifyMachinesLoginTypeTask extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>1-进行中，2已完成</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>执行成功数量</p>
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * <p>执行失败主机列表</p>
    */
    @SerializedName("FailList")
    @Expose
    private ModifyLoginTypeFailInfo [] FailList;

    /**
    * <p>修改成功的实例ID列表</p>
    */
    @SerializedName("SuccessInstances")
    @Expose
    private String [] SuccessInstances;

    /**
    * <p>修改中的实例ID列表</p>
    */
    @SerializedName("ProgressingInstances")
    @Expose
    private String [] ProgressingInstances;

    /**
    * <p>失败主机数</p>
    */
    @SerializedName("FailedHostCount")
    @Expose
    private Long FailedHostCount;

    /**
     * Get <p>任务ID</p> 
     * @return Id <p>任务ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>任务ID</p>
     * @param Id <p>任务ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>1-进行中，2已完成</p> 
     * @return Status <p>1-进行中，2已完成</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>1-进行中，2已完成</p>
     * @param Status <p>1-进行中，2已完成</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>执行成功数量</p> 
     * @return SuccessCount <p>执行成功数量</p>
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>执行成功数量</p>
     * @param SuccessCount <p>执行成功数量</p>
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get <p>执行失败主机列表</p> 
     * @return FailList <p>执行失败主机列表</p>
     */
    public ModifyLoginTypeFailInfo [] getFailList() {
        return this.FailList;
    }

    /**
     * Set <p>执行失败主机列表</p>
     * @param FailList <p>执行失败主机列表</p>
     */
    public void setFailList(ModifyLoginTypeFailInfo [] FailList) {
        this.FailList = FailList;
    }

    /**
     * Get <p>修改成功的实例ID列表</p> 
     * @return SuccessInstances <p>修改成功的实例ID列表</p>
     */
    public String [] getSuccessInstances() {
        return this.SuccessInstances;
    }

    /**
     * Set <p>修改成功的实例ID列表</p>
     * @param SuccessInstances <p>修改成功的实例ID列表</p>
     */
    public void setSuccessInstances(String [] SuccessInstances) {
        this.SuccessInstances = SuccessInstances;
    }

    /**
     * Get <p>修改中的实例ID列表</p> 
     * @return ProgressingInstances <p>修改中的实例ID列表</p>
     */
    public String [] getProgressingInstances() {
        return this.ProgressingInstances;
    }

    /**
     * Set <p>修改中的实例ID列表</p>
     * @param ProgressingInstances <p>修改中的实例ID列表</p>
     */
    public void setProgressingInstances(String [] ProgressingInstances) {
        this.ProgressingInstances = ProgressingInstances;
    }

    /**
     * Get <p>失败主机数</p> 
     * @return FailedHostCount <p>失败主机数</p>
     */
    public Long getFailedHostCount() {
        return this.FailedHostCount;
    }

    /**
     * Set <p>失败主机数</p>
     * @param FailedHostCount <p>失败主机数</p>
     */
    public void setFailedHostCount(Long FailedHostCount) {
        this.FailedHostCount = FailedHostCount;
    }

    public ModifyMachinesLoginTypeTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMachinesLoginTypeTask(ModifyMachinesLoginTypeTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailList != null) {
            this.FailList = new ModifyLoginTypeFailInfo[source.FailList.length];
            for (int i = 0; i < source.FailList.length; i++) {
                this.FailList[i] = new ModifyLoginTypeFailInfo(source.FailList[i]);
            }
        }
        if (source.SuccessInstances != null) {
            this.SuccessInstances = new String[source.SuccessInstances.length];
            for (int i = 0; i < source.SuccessInstances.length; i++) {
                this.SuccessInstances[i] = new String(source.SuccessInstances[i]);
            }
        }
        if (source.ProgressingInstances != null) {
            this.ProgressingInstances = new String[source.ProgressingInstances.length];
            for (int i = 0; i < source.ProgressingInstances.length; i++) {
                this.ProgressingInstances[i] = new String(source.ProgressingInstances[i]);
            }
        }
        if (source.FailedHostCount != null) {
            this.FailedHostCount = new Long(source.FailedHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamArrayObj(map, prefix + "FailList.", this.FailList);
        this.setParamArraySimple(map, prefix + "SuccessInstances.", this.SuccessInstances);
        this.setParamArraySimple(map, prefix + "ProgressingInstances.", this.ProgressingInstances);
        this.setParamSimple(map, prefix + "FailedHostCount", this.FailedHostCount);

    }
}

