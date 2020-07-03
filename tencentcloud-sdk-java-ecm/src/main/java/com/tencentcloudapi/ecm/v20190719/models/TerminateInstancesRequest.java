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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateInstancesRequest extends AbstractModel{

    /**
    * 待销毁的实例ID列表。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 是否定时销毁，默认为否。
    */
    @SerializedName("TerminateDelay")
    @Expose
    private Boolean TerminateDelay;

    /**
    * 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。
    */
    @SerializedName("TerminateTime")
    @Expose
    private String TerminateTime;

    /**
     * Get 待销毁的实例ID列表。 
     * @return InstanceIdSet 待销毁的实例ID列表。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 待销毁的实例ID列表。
     * @param InstanceIdSet 待销毁的实例ID列表。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 是否定时销毁，默认为否。 
     * @return TerminateDelay 是否定时销毁，默认为否。
     */
    public Boolean getTerminateDelay() {
        return this.TerminateDelay;
    }

    /**
     * Set 是否定时销毁，默认为否。
     * @param TerminateDelay 是否定时销毁，默认为否。
     */
    public void setTerminateDelay(Boolean TerminateDelay) {
        this.TerminateDelay = TerminateDelay;
    }

    /**
     * Get 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。 
     * @return TerminateTime 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。
     */
    public String getTerminateTime() {
        return this.TerminateTime;
    }

    /**
     * Set 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。
     * @param TerminateTime 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。
     */
    public void setTerminateTime(String TerminateTime) {
        this.TerminateTime = TerminateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "TerminateDelay", this.TerminateDelay);
        this.setParamSimple(map, prefix + "TerminateTime", this.TerminateTime);

    }
}

