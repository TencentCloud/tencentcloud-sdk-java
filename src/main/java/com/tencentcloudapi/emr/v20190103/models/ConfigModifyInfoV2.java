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

public class ConfigModifyInfoV2 extends AbstractModel {

    /**
    * 操作类型，可选值：

- 0：新建队列
- 1：编辑-全量覆盖
- 2：新建子队列
- 3：删除
- 4：克隆，与新建子队列的行为一样，特别的对于`fair`，可以复制子队列到新建队列
- 6：编辑-增量更新
    */
    @SerializedName("OpType")
    @Expose
    private Long OpType;

    /**
    * 队列名称，不支持修改。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 新建队列 传root的MyId；新建子队列 传 选中队列的 myId；克隆 要传 选中队列 parentId
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 编辑、删除 传选中队列的 myId。克隆只有在调度器是`fair`时才需要传，用来复制子队列到新队列。
    */
    @SerializedName("MyId")
    @Expose
    private String MyId;

    /**
    * 基础配置信息。key的取值与**DescribeYarnQueue**返回的字段一致。
###### 公平调度器
key的取值信息如下：

- type，父队列，取值为 **parent** 或 **null**
- aclSubmitApps，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- aclAdministerApps，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- minSharePreemptionTimeout，最小共享优先权超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionTimeout，公平份额抢占超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionThreshold，公平份额抢占阈值，取值为**数字字符串**或**null**，其中数字的范围是（0，1]
- allowPreemptionFrom，抢占模式，取值为**布尔字符串**或**null**
- schedulingPolicy，调度策略，取值为**drf**、**fair**、**fifo**或**null**

```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
###### 容量调度器
key的取值信息如下：

- state，队列状态，取值为**STOPPED**或**RUNNING**
- default-node-label-expression，默认标签表达式，取值为**标签**或**null**
- acl_submit_applications，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- acl_administer_queue，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- maximum-allocation-mb，分配Container最大内存数量，取值为**数字字符串**或**null**
- maximum-allocation-vcores，Container最大vCore数量，取值为**数字字符串**或**null**
```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicParams")
    @Expose
    private ItemSeq BasicParams;

    /**
    * 配置集信息，取值见该复杂类型的参数说明。配置集是计划模式在队列中表现，表示的是不同时间段不同的配置值，所有队列的配置集名称都一样，对于单个队列，每个配置集中的标签与参数都一样，只是参数值不同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigSetParams")
    @Expose
    private ConfigSetInfo [] ConfigSetParams;

    /**
    * 容量调度专用，`OpType`为`6`时才生效，表示要删除这个队列中的哪些标签。优先级高于ConfigSetParams中的LabelParams。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteLables")
    @Expose
    private String [] DeleteLables;

    /**
     * Get 操作类型，可选值：

- 0：新建队列
- 1：编辑-全量覆盖
- 2：新建子队列
- 3：删除
- 4：克隆，与新建子队列的行为一样，特别的对于`fair`，可以复制子队列到新建队列
- 6：编辑-增量更新 
     * @return OpType 操作类型，可选值：

- 0：新建队列
- 1：编辑-全量覆盖
- 2：新建子队列
- 3：删除
- 4：克隆，与新建子队列的行为一样，特别的对于`fair`，可以复制子队列到新建队列
- 6：编辑-增量更新
     */
    public Long getOpType() {
        return this.OpType;
    }

    /**
     * Set 操作类型，可选值：

- 0：新建队列
- 1：编辑-全量覆盖
- 2：新建子队列
- 3：删除
- 4：克隆，与新建子队列的行为一样，特别的对于`fair`，可以复制子队列到新建队列
- 6：编辑-增量更新
     * @param OpType 操作类型，可选值：

- 0：新建队列
- 1：编辑-全量覆盖
- 2：新建子队列
- 3：删除
- 4：克隆，与新建子队列的行为一样，特别的对于`fair`，可以复制子队列到新建队列
- 6：编辑-增量更新
     */
    public void setOpType(Long OpType) {
        this.OpType = OpType;
    }

    /**
     * Get 队列名称，不支持修改。 
     * @return Name 队列名称，不支持修改。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 队列名称，不支持修改。
     * @param Name 队列名称，不支持修改。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 新建队列 传root的MyId；新建子队列 传 选中队列的 myId；克隆 要传 选中队列 parentId 
     * @return ParentId 新建队列 传root的MyId；新建子队列 传 选中队列的 myId；克隆 要传 选中队列 parentId
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 新建队列 传root的MyId；新建子队列 传 选中队列的 myId；克隆 要传 选中队列 parentId
     * @param ParentId 新建队列 传root的MyId；新建子队列 传 选中队列的 myId；克隆 要传 选中队列 parentId
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 编辑、删除 传选中队列的 myId。克隆只有在调度器是`fair`时才需要传，用来复制子队列到新队列。 
     * @return MyId 编辑、删除 传选中队列的 myId。克隆只有在调度器是`fair`时才需要传，用来复制子队列到新队列。
     */
    public String getMyId() {
        return this.MyId;
    }

    /**
     * Set 编辑、删除 传选中队列的 myId。克隆只有在调度器是`fair`时才需要传，用来复制子队列到新队列。
     * @param MyId 编辑、删除 传选中队列的 myId。克隆只有在调度器是`fair`时才需要传，用来复制子队列到新队列。
     */
    public void setMyId(String MyId) {
        this.MyId = MyId;
    }

    /**
     * Get 基础配置信息。key的取值与**DescribeYarnQueue**返回的字段一致。
###### 公平调度器
key的取值信息如下：

- type，父队列，取值为 **parent** 或 **null**
- aclSubmitApps，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- aclAdministerApps，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- minSharePreemptionTimeout，最小共享优先权超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionTimeout，公平份额抢占超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionThreshold，公平份额抢占阈值，取值为**数字字符串**或**null**，其中数字的范围是（0，1]
- allowPreemptionFrom，抢占模式，取值为**布尔字符串**或**null**
- schedulingPolicy，调度策略，取值为**drf**、**fair**、**fifo**或**null**

```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
###### 容量调度器
key的取值信息如下：

- state，队列状态，取值为**STOPPED**或**RUNNING**
- default-node-label-expression，默认标签表达式，取值为**标签**或**null**
- acl_submit_applications，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- acl_administer_queue，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- maximum-allocation-mb，分配Container最大内存数量，取值为**数字字符串**或**null**
- maximum-allocation-vcores，Container最大vCore数量，取值为**数字字符串**或**null**
```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicParams 基础配置信息。key的取值与**DescribeYarnQueue**返回的字段一致。
###### 公平调度器
key的取值信息如下：

- type，父队列，取值为 **parent** 或 **null**
- aclSubmitApps，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- aclAdministerApps，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- minSharePreemptionTimeout，最小共享优先权超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionTimeout，公平份额抢占超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionThreshold，公平份额抢占阈值，取值为**数字字符串**或**null**，其中数字的范围是（0，1]
- allowPreemptionFrom，抢占模式，取值为**布尔字符串**或**null**
- schedulingPolicy，调度策略，取值为**drf**、**fair**、**fifo**或**null**

```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
###### 容量调度器
key的取值信息如下：

- state，队列状态，取值为**STOPPED**或**RUNNING**
- default-node-label-expression，默认标签表达式，取值为**标签**或**null**
- acl_submit_applications，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- acl_administer_queue，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- maximum-allocation-mb，分配Container最大内存数量，取值为**数字字符串**或**null**
- maximum-allocation-vcores，Container最大vCore数量，取值为**数字字符串**或**null**
```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ItemSeq getBasicParams() {
        return this.BasicParams;
    }

    /**
     * Set 基础配置信息。key的取值与**DescribeYarnQueue**返回的字段一致。
###### 公平调度器
key的取值信息如下：

- type，父队列，取值为 **parent** 或 **null**
- aclSubmitApps，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- aclAdministerApps，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- minSharePreemptionTimeout，最小共享优先权超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionTimeout，公平份额抢占超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionThreshold，公平份额抢占阈值，取值为**数字字符串**或**null**，其中数字的范围是（0，1]
- allowPreemptionFrom，抢占模式，取值为**布尔字符串**或**null**
- schedulingPolicy，调度策略，取值为**drf**、**fair**、**fifo**或**null**

```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
###### 容量调度器
key的取值信息如下：

- state，队列状态，取值为**STOPPED**或**RUNNING**
- default-node-label-expression，默认标签表达式，取值为**标签**或**null**
- acl_submit_applications，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- acl_administer_queue，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- maximum-allocation-mb，分配Container最大内存数量，取值为**数字字符串**或**null**
- maximum-allocation-vcores，Container最大vCore数量，取值为**数字字符串**或**null**
```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicParams 基础配置信息。key的取值与**DescribeYarnQueue**返回的字段一致。
###### 公平调度器
key的取值信息如下：

- type，父队列，取值为 **parent** 或 **null**
- aclSubmitApps，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- aclAdministerApps，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- minSharePreemptionTimeout，最小共享优先权超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionTimeout，公平份额抢占超时时间，取值为**数字字符串**或**null**
- fairSharePreemptionThreshold，公平份额抢占阈值，取值为**数字字符串**或**null**，其中数字的范围是（0，1]
- allowPreemptionFrom，抢占模式，取值为**布尔字符串**或**null**
- schedulingPolicy，调度策略，取值为**drf**、**fair**、**fifo**或**null**

```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
###### 容量调度器
key的取值信息如下：

- state，队列状态，取值为**STOPPED**或**RUNNING**
- default-node-label-expression，默认标签表达式，取值为**标签**或**null**
- acl_submit_applications，提交访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- acl_administer_queue，管理访问控制，取值为**AclForYarnQueue类型的json串**或**null**
- maximum-allocation-mb，分配Container最大内存数量，取值为**数字字符串**或**null**
- maximum-allocation-vcores，Container最大vCore数量，取值为**数字字符串**或**null**
```
type AclForYarnQueue struct {
	User  *string `json:"user"` //用户名
	Group *string `json:"group"`//组名
}
```
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicParams(ItemSeq BasicParams) {
        this.BasicParams = BasicParams;
    }

    /**
     * Get 配置集信息，取值见该复杂类型的参数说明。配置集是计划模式在队列中表现，表示的是不同时间段不同的配置值，所有队列的配置集名称都一样，对于单个队列，每个配置集中的标签与参数都一样，只是参数值不同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigSetParams 配置集信息，取值见该复杂类型的参数说明。配置集是计划模式在队列中表现，表示的是不同时间段不同的配置值，所有队列的配置集名称都一样，对于单个队列，每个配置集中的标签与参数都一样，只是参数值不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConfigSetInfo [] getConfigSetParams() {
        return this.ConfigSetParams;
    }

    /**
     * Set 配置集信息，取值见该复杂类型的参数说明。配置集是计划模式在队列中表现，表示的是不同时间段不同的配置值，所有队列的配置集名称都一样，对于单个队列，每个配置集中的标签与参数都一样，只是参数值不同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigSetParams 配置集信息，取值见该复杂类型的参数说明。配置集是计划模式在队列中表现，表示的是不同时间段不同的配置值，所有队列的配置集名称都一样，对于单个队列，每个配置集中的标签与参数都一样，只是参数值不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigSetParams(ConfigSetInfo [] ConfigSetParams) {
        this.ConfigSetParams = ConfigSetParams;
    }

    /**
     * Get 容量调度专用，`OpType`为`6`时才生效，表示要删除这个队列中的哪些标签。优先级高于ConfigSetParams中的LabelParams。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteLables 容量调度专用，`OpType`为`6`时才生效，表示要删除这个队列中的哪些标签。优先级高于ConfigSetParams中的LabelParams。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDeleteLables() {
        return this.DeleteLables;
    }

    /**
     * Set 容量调度专用，`OpType`为`6`时才生效，表示要删除这个队列中的哪些标签。优先级高于ConfigSetParams中的LabelParams。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteLables 容量调度专用，`OpType`为`6`时才生效，表示要删除这个队列中的哪些标签。优先级高于ConfigSetParams中的LabelParams。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteLables(String [] DeleteLables) {
        this.DeleteLables = DeleteLables;
    }

    public ConfigModifyInfoV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigModifyInfoV2(ConfigModifyInfoV2 source) {
        if (source.OpType != null) {
            this.OpType = new Long(source.OpType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.MyId != null) {
            this.MyId = new String(source.MyId);
        }
        if (source.BasicParams != null) {
            this.BasicParams = new ItemSeq(source.BasicParams);
        }
        if (source.ConfigSetParams != null) {
            this.ConfigSetParams = new ConfigSetInfo[source.ConfigSetParams.length];
            for (int i = 0; i < source.ConfigSetParams.length; i++) {
                this.ConfigSetParams[i] = new ConfigSetInfo(source.ConfigSetParams[i]);
            }
        }
        if (source.DeleteLables != null) {
            this.DeleteLables = new String[source.DeleteLables.length];
            for (int i = 0; i < source.DeleteLables.length; i++) {
                this.DeleteLables[i] = new String(source.DeleteLables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "MyId", this.MyId);
        this.setParamObj(map, prefix + "BasicParams.", this.BasicParams);
        this.setParamArrayObj(map, prefix + "ConfigSetParams.", this.ConfigSetParams);
        this.setParamArraySimple(map, prefix + "DeleteLables.", this.DeleteLables);

    }
}

