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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlobalConfigRequest extends AbstractModel {

    /**
    * emr集群的英文id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 修改的配置列表。其中Key的取值与`DescribeGlobalConfig`接口的出参一一对应，不区分大小写（如果报错找不到Key，以出参为准），分别为：
1. 开启或关闭资源调度：enableResourceSchedule；在关闭时会有一个同步的选项，Key为sync，取值为true或false。
2. 调度器类型：scheduler。
2. 开启或关闭标签：enableLabel，取值为true或false。
2. 标签目录：labelDir。
3. 是否覆盖用户指定队列：queueMappingOverride，取值为true、false。
4. 程序上限：userMaxAppsDefault。
5. 动态配置项：`DescribeGlobalConfig`接口返回的DefaultSettings中的Name字段。
Value的取值都是字符串，对于**是否覆盖用户指定队列**、**程序上限**，json规范中的null表示清空该配置的值。支持修改单个配置项的值。对于**动态配置项**则需要全量传递以进行覆盖。
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
     * Get emr集群的英文id 
     * @return InstanceId emr集群的英文id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set emr集群的英文id
     * @param InstanceId emr集群的英文id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 修改的配置列表。其中Key的取值与`DescribeGlobalConfig`接口的出参一一对应，不区分大小写（如果报错找不到Key，以出参为准），分别为：
1. 开启或关闭资源调度：enableResourceSchedule；在关闭时会有一个同步的选项，Key为sync，取值为true或false。
2. 调度器类型：scheduler。
2. 开启或关闭标签：enableLabel，取值为true或false。
2. 标签目录：labelDir。
3. 是否覆盖用户指定队列：queueMappingOverride，取值为true、false。
4. 程序上限：userMaxAppsDefault。
5. 动态配置项：`DescribeGlobalConfig`接口返回的DefaultSettings中的Name字段。
Value的取值都是字符串，对于**是否覆盖用户指定队列**、**程序上限**，json规范中的null表示清空该配置的值。支持修改单个配置项的值。对于**动态配置项**则需要全量传递以进行覆盖。 
     * @return Items 修改的配置列表。其中Key的取值与`DescribeGlobalConfig`接口的出参一一对应，不区分大小写（如果报错找不到Key，以出参为准），分别为：
1. 开启或关闭资源调度：enableResourceSchedule；在关闭时会有一个同步的选项，Key为sync，取值为true或false。
2. 调度器类型：scheduler。
2. 开启或关闭标签：enableLabel，取值为true或false。
2. 标签目录：labelDir。
3. 是否覆盖用户指定队列：queueMappingOverride，取值为true、false。
4. 程序上限：userMaxAppsDefault。
5. 动态配置项：`DescribeGlobalConfig`接口返回的DefaultSettings中的Name字段。
Value的取值都是字符串，对于**是否覆盖用户指定队列**、**程序上限**，json规范中的null表示清空该配置的值。支持修改单个配置项的值。对于**动态配置项**则需要全量传递以进行覆盖。
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set 修改的配置列表。其中Key的取值与`DescribeGlobalConfig`接口的出参一一对应，不区分大小写（如果报错找不到Key，以出参为准），分别为：
1. 开启或关闭资源调度：enableResourceSchedule；在关闭时会有一个同步的选项，Key为sync，取值为true或false。
2. 调度器类型：scheduler。
2. 开启或关闭标签：enableLabel，取值为true或false。
2. 标签目录：labelDir。
3. 是否覆盖用户指定队列：queueMappingOverride，取值为true、false。
4. 程序上限：userMaxAppsDefault。
5. 动态配置项：`DescribeGlobalConfig`接口返回的DefaultSettings中的Name字段。
Value的取值都是字符串，对于**是否覆盖用户指定队列**、**程序上限**，json规范中的null表示清空该配置的值。支持修改单个配置项的值。对于**动态配置项**则需要全量传递以进行覆盖。
     * @param Items 修改的配置列表。其中Key的取值与`DescribeGlobalConfig`接口的出参一一对应，不区分大小写（如果报错找不到Key，以出参为准），分别为：
1. 开启或关闭资源调度：enableResourceSchedule；在关闭时会有一个同步的选项，Key为sync，取值为true或false。
2. 调度器类型：scheduler。
2. 开启或关闭标签：enableLabel，取值为true或false。
2. 标签目录：labelDir。
3. 是否覆盖用户指定队列：queueMappingOverride，取值为true、false。
4. 程序上限：userMaxAppsDefault。
5. 动态配置项：`DescribeGlobalConfig`接口返回的DefaultSettings中的Name字段。
Value的取值都是字符串，对于**是否覆盖用户指定队列**、**程序上限**，json规范中的null表示清空该配置的值。支持修改单个配置项的值。对于**动态配置项**则需要全量传递以进行覆盖。
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    public ModifyGlobalConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalConfigRequest(ModifyGlobalConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Items != null) {
            this.Items = new Item[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Item(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

