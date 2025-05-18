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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepairTaskControlRequest extends AbstractModel {

    /**
    * 待授权任务实例对应的产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 指定待操作的实例ID列表，仅允许对列表中的实例ID相关的维修任务发起授权，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`InstanceId`获取。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 指定待操作的维修任务ID，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`TaskId`获取。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 操作类型，当前只支持传入`AuthorizeRepair`。
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 预约授权时间，形如`2023-01-01 12:00:00`。预约时间需晚于当前时间至少5分钟，且在48小时之内。
    */
    @SerializedName("OrderAuthTime")
    @Expose
    private String OrderAuthTime;

    /**
    * 附加的授权处理策略，不传或为空时，按默认授权方式进行处理。对于支持弃盘迁移授权的维修任务，当且仅当传入`LossyLocal`时，代表本次授权可允许发起弃盘迁移。

注意：
1. 指定`TaskSubMethod`为`LossyLocal`调用接口发起**弃盘迁移授权**时，本地盘实例的**所有本地盘数据都会清空**，相当于**重新部署本地盘实例**。
2. 对于非本地盘实例，或不支持弃盘迁移选项的任务，指定`TaskSubMethod`为`LossyLocal`时接口不会报错，不过后端会自动忽略该参数。
3. 特别的：如果本地盘实例系统盘是CBS云盘，并且`/etc/fstab`里之前配置了本地盘的自动挂载项，建议可根据业务侧的实际需求，评估是否在对应挂载项追加上`nofail`参数（代表对应挂载点挂载失败不阻塞开机流程）或注释对应的挂载路径。否则授权弃盘迁移后，对应本地盘数据已清空，自动挂载失败会导致实例开机流程失败进入救援模式。具体可参考 [Linux 实例：/etc/fstab 配置错误导致无法登录](https://cloud.tencent.com/document/product/213/72039)。
    */
    @SerializedName("TaskSubMethod")
    @Expose
    private String TaskSubMethod;

    /**
     * Get 待授权任务实例对应的产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器 
     * @return Product 待授权任务实例对应的产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 待授权任务实例对应的产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
     * @param Product 待授权任务实例对应的产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 指定待操作的实例ID列表，仅允许对列表中的实例ID相关的维修任务发起授权，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`InstanceId`获取。 
     * @return InstanceIds 指定待操作的实例ID列表，仅允许对列表中的实例ID相关的维修任务发起授权，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`InstanceId`获取。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 指定待操作的实例ID列表，仅允许对列表中的实例ID相关的维修任务发起授权，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`InstanceId`获取。
     * @param InstanceIds 指定待操作的实例ID列表，仅允许对列表中的实例ID相关的维修任务发起授权，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`InstanceId`获取。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 指定待操作的维修任务ID，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`TaskId`获取。 
     * @return TaskId 指定待操作的维修任务ID，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`TaskId`获取。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 指定待操作的维修任务ID，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`TaskId`获取。
     * @param TaskId 指定待操作的维修任务ID，可通过 [DescribeTaskInfo](https://cloud.tencent.com/document/api/213/87933) 接口返回值中的`TaskId`获取。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 操作类型，当前只支持传入`AuthorizeRepair`。 
     * @return Operate 操作类型，当前只支持传入`AuthorizeRepair`。
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作类型，当前只支持传入`AuthorizeRepair`。
     * @param Operate 操作类型，当前只支持传入`AuthorizeRepair`。
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 预约授权时间，形如`2023-01-01 12:00:00`。预约时间需晚于当前时间至少5分钟，且在48小时之内。 
     * @return OrderAuthTime 预约授权时间，形如`2023-01-01 12:00:00`。预约时间需晚于当前时间至少5分钟，且在48小时之内。
     */
    public String getOrderAuthTime() {
        return this.OrderAuthTime;
    }

    /**
     * Set 预约授权时间，形如`2023-01-01 12:00:00`。预约时间需晚于当前时间至少5分钟，且在48小时之内。
     * @param OrderAuthTime 预约授权时间，形如`2023-01-01 12:00:00`。预约时间需晚于当前时间至少5分钟，且在48小时之内。
     */
    public void setOrderAuthTime(String OrderAuthTime) {
        this.OrderAuthTime = OrderAuthTime;
    }

    /**
     * Get 附加的授权处理策略，不传或为空时，按默认授权方式进行处理。对于支持弃盘迁移授权的维修任务，当且仅当传入`LossyLocal`时，代表本次授权可允许发起弃盘迁移。

注意：
1. 指定`TaskSubMethod`为`LossyLocal`调用接口发起**弃盘迁移授权**时，本地盘实例的**所有本地盘数据都会清空**，相当于**重新部署本地盘实例**。
2. 对于非本地盘实例，或不支持弃盘迁移选项的任务，指定`TaskSubMethod`为`LossyLocal`时接口不会报错，不过后端会自动忽略该参数。
3. 特别的：如果本地盘实例系统盘是CBS云盘，并且`/etc/fstab`里之前配置了本地盘的自动挂载项，建议可根据业务侧的实际需求，评估是否在对应挂载项追加上`nofail`参数（代表对应挂载点挂载失败不阻塞开机流程）或注释对应的挂载路径。否则授权弃盘迁移后，对应本地盘数据已清空，自动挂载失败会导致实例开机流程失败进入救援模式。具体可参考 [Linux 实例：/etc/fstab 配置错误导致无法登录](https://cloud.tencent.com/document/product/213/72039)。 
     * @return TaskSubMethod 附加的授权处理策略，不传或为空时，按默认授权方式进行处理。对于支持弃盘迁移授权的维修任务，当且仅当传入`LossyLocal`时，代表本次授权可允许发起弃盘迁移。

注意：
1. 指定`TaskSubMethod`为`LossyLocal`调用接口发起**弃盘迁移授权**时，本地盘实例的**所有本地盘数据都会清空**，相当于**重新部署本地盘实例**。
2. 对于非本地盘实例，或不支持弃盘迁移选项的任务，指定`TaskSubMethod`为`LossyLocal`时接口不会报错，不过后端会自动忽略该参数。
3. 特别的：如果本地盘实例系统盘是CBS云盘，并且`/etc/fstab`里之前配置了本地盘的自动挂载项，建议可根据业务侧的实际需求，评估是否在对应挂载项追加上`nofail`参数（代表对应挂载点挂载失败不阻塞开机流程）或注释对应的挂载路径。否则授权弃盘迁移后，对应本地盘数据已清空，自动挂载失败会导致实例开机流程失败进入救援模式。具体可参考 [Linux 实例：/etc/fstab 配置错误导致无法登录](https://cloud.tencent.com/document/product/213/72039)。
     */
    public String getTaskSubMethod() {
        return this.TaskSubMethod;
    }

    /**
     * Set 附加的授权处理策略，不传或为空时，按默认授权方式进行处理。对于支持弃盘迁移授权的维修任务，当且仅当传入`LossyLocal`时，代表本次授权可允许发起弃盘迁移。

注意：
1. 指定`TaskSubMethod`为`LossyLocal`调用接口发起**弃盘迁移授权**时，本地盘实例的**所有本地盘数据都会清空**，相当于**重新部署本地盘实例**。
2. 对于非本地盘实例，或不支持弃盘迁移选项的任务，指定`TaskSubMethod`为`LossyLocal`时接口不会报错，不过后端会自动忽略该参数。
3. 特别的：如果本地盘实例系统盘是CBS云盘，并且`/etc/fstab`里之前配置了本地盘的自动挂载项，建议可根据业务侧的实际需求，评估是否在对应挂载项追加上`nofail`参数（代表对应挂载点挂载失败不阻塞开机流程）或注释对应的挂载路径。否则授权弃盘迁移后，对应本地盘数据已清空，自动挂载失败会导致实例开机流程失败进入救援模式。具体可参考 [Linux 实例：/etc/fstab 配置错误导致无法登录](https://cloud.tencent.com/document/product/213/72039)。
     * @param TaskSubMethod 附加的授权处理策略，不传或为空时，按默认授权方式进行处理。对于支持弃盘迁移授权的维修任务，当且仅当传入`LossyLocal`时，代表本次授权可允许发起弃盘迁移。

注意：
1. 指定`TaskSubMethod`为`LossyLocal`调用接口发起**弃盘迁移授权**时，本地盘实例的**所有本地盘数据都会清空**，相当于**重新部署本地盘实例**。
2. 对于非本地盘实例，或不支持弃盘迁移选项的任务，指定`TaskSubMethod`为`LossyLocal`时接口不会报错，不过后端会自动忽略该参数。
3. 特别的：如果本地盘实例系统盘是CBS云盘，并且`/etc/fstab`里之前配置了本地盘的自动挂载项，建议可根据业务侧的实际需求，评估是否在对应挂载项追加上`nofail`参数（代表对应挂载点挂载失败不阻塞开机流程）或注释对应的挂载路径。否则授权弃盘迁移后，对应本地盘数据已清空，自动挂载失败会导致实例开机流程失败进入救援模式。具体可参考 [Linux 实例：/etc/fstab 配置错误导致无法登录](https://cloud.tencent.com/document/product/213/72039)。
     */
    public void setTaskSubMethod(String TaskSubMethod) {
        this.TaskSubMethod = TaskSubMethod;
    }

    public RepairTaskControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepairTaskControlRequest(RepairTaskControlRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.OrderAuthTime != null) {
            this.OrderAuthTime = new String(source.OrderAuthTime);
        }
        if (source.TaskSubMethod != null) {
            this.TaskSubMethod = new String(source.TaskSubMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "OrderAuthTime", this.OrderAuthTime);
        this.setParamSimple(map, prefix + "TaskSubMethod", this.TaskSubMethod);

    }
}

