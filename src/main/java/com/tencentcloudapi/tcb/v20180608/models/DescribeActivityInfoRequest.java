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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeActivityInfoRequest extends AbstractModel{

    /**
    * 活动id列表
    */
    @SerializedName("ActivityIdList")
    @Expose
    private Long [] ActivityIdList;

    /**
     * Get 活动id列表 
     * @return ActivityIdList 活动id列表
     */
    public Long [] getActivityIdList() {
        return this.ActivityIdList;
    }

    /**
     * Set 活动id列表
     * @param ActivityIdList 活动id列表
     */
    public void setActivityIdList(Long [] ActivityIdList) {
        this.ActivityIdList = ActivityIdList;
    }

    public DescribeActivityInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeActivityInfoRequest(DescribeActivityInfoRequest source) {
        if (source.ActivityIdList != null) {
            this.ActivityIdList = new Long[source.ActivityIdList.length];
            for (int i = 0; i < source.ActivityIdList.length; i++) {
                this.ActivityIdList[i] = new Long(source.ActivityIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ActivityIdList.", this.ActivityIdList);

    }
}

