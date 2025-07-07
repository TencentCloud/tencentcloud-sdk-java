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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirtualDevicesPageRsp extends AbstractModel {

    /**
    * 数据分页信息
    */
    @SerializedName("Paging")
    @Expose
    private Paging Paging;

    /**
    * 设备列表
    */
    @SerializedName("Items")
    @Expose
    private DeviceDetail [] Items;

    /**
     * Get 数据分页信息 
     * @return Paging 数据分页信息
     */
    public Paging getPaging() {
        return this.Paging;
    }

    /**
     * Set 数据分页信息
     * @param Paging 数据分页信息
     */
    public void setPaging(Paging Paging) {
        this.Paging = Paging;
    }

    /**
     * Get 设备列表 
     * @return Items 设备列表
     */
    public DeviceDetail [] getItems() {
        return this.Items;
    }

    /**
     * Set 设备列表
     * @param Items 设备列表
     */
    public void setItems(DeviceDetail [] Items) {
        this.Items = Items;
    }

    public DescribeVirtualDevicesPageRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirtualDevicesPageRsp(DescribeVirtualDevicesPageRsp source) {
        if (source.Paging != null) {
            this.Paging = new Paging(source.Paging);
        }
        if (source.Items != null) {
            this.Items = new DeviceDetail[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DeviceDetail(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Paging.", this.Paging);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

