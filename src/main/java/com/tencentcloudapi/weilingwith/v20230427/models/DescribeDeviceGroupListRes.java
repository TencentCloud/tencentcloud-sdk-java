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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceGroupListRes extends AbstractModel {

    /**
    * 设备分组list
    */
    @SerializedName("List")
    @Expose
    private DescribeGroupInfo [] List;

    /**
     * Get 设备分组list 
     * @return List 设备分组list
     */
    public DescribeGroupInfo [] getList() {
        return this.List;
    }

    /**
     * Set 设备分组list
     * @param List 设备分组list
     */
    public void setList(DescribeGroupInfo [] List) {
        this.List = List;
    }

    public DescribeDeviceGroupListRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceGroupListRes(DescribeDeviceGroupListRes source) {
        if (source.List != null) {
            this.List = new DescribeGroupInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new DescribeGroupInfo(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

