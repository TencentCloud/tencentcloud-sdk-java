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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指预修改网络的类别，包括：
- changeVip：指切换私有网络，包含其内网IPv4地址及端口。
- changeVpc：指切换私有网络所属子网。
- changeBaseToVpc：指基础网络切换为私有网络。
- changeVPort：指仅修改实例网络端口。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 指实例私有网络内网 IPv4 地址。当**Operation**为**changeVip**时，需配置该参数。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 指修改后的私有网络 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 指修改后的私有网络所属子网 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 原内网 IPv4 地址保留时长。
- 单位：天。
- 取值范围：0、1、2、3、7、15。

**说明**：设置原地址保留时长需最新版SDK，否则原地址将立即释放，查看SDK版本，请参见 [SDK中心](https://cloud.tencent.com/document/sdk)。
    */
    @SerializedName("Recycle")
    @Expose
    private Long Recycle;

    /**
    * 指修改后的网络端口。当**Operation**为**changeVPort**或**changeVip**时，需配置该参数。取值范围为[1024,65535]。
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指预修改网络的类别，包括：
- changeVip：指切换私有网络，包含其内网IPv4地址及端口。
- changeVpc：指切换私有网络所属子网。
- changeBaseToVpc：指基础网络切换为私有网络。
- changeVPort：指仅修改实例网络端口。 
     * @return Operation 指预修改网络的类别，包括：
- changeVip：指切换私有网络，包含其内网IPv4地址及端口。
- changeVpc：指切换私有网络所属子网。
- changeBaseToVpc：指基础网络切换为私有网络。
- changeVPort：指仅修改实例网络端口。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 指预修改网络的类别，包括：
- changeVip：指切换私有网络，包含其内网IPv4地址及端口。
- changeVpc：指切换私有网络所属子网。
- changeBaseToVpc：指基础网络切换为私有网络。
- changeVPort：指仅修改实例网络端口。
     * @param Operation 指预修改网络的类别，包括：
- changeVip：指切换私有网络，包含其内网IPv4地址及端口。
- changeVpc：指切换私有网络所属子网。
- changeBaseToVpc：指基础网络切换为私有网络。
- changeVPort：指仅修改实例网络端口。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 指实例私有网络内网 IPv4 地址。当**Operation**为**changeVip**时，需配置该参数。 
     * @return Vip 指实例私有网络内网 IPv4 地址。当**Operation**为**changeVip**时，需配置该参数。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 指实例私有网络内网 IPv4 地址。当**Operation**为**changeVip**时，需配置该参数。
     * @param Vip 指实例私有网络内网 IPv4 地址。当**Operation**为**changeVip**时，需配置该参数。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 指修改后的私有网络 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。 
     * @return VpcId 指修改后的私有网络 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 指修改后的私有网络 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。
     * @param VpcId 指修改后的私有网络 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 指修改后的私有网络所属子网 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。 
     * @return SubnetId 指修改后的私有网络所属子网 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 指修改后的私有网络所属子网 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。
     * @param SubnetId 指修改后的私有网络所属子网 ID，当**Operation**为**changeVpc**或**changeBaseToVpc**时，需配置该参数。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 原内网 IPv4 地址保留时长。
- 单位：天。
- 取值范围：0、1、2、3、7、15。

**说明**：设置原地址保留时长需最新版SDK，否则原地址将立即释放，查看SDK版本，请参见 [SDK中心](https://cloud.tencent.com/document/sdk)。 
     * @return Recycle 原内网 IPv4 地址保留时长。
- 单位：天。
- 取值范围：0、1、2、3、7、15。

**说明**：设置原地址保留时长需最新版SDK，否则原地址将立即释放，查看SDK版本，请参见 [SDK中心](https://cloud.tencent.com/document/sdk)。
     */
    public Long getRecycle() {
        return this.Recycle;
    }

    /**
     * Set 原内网 IPv4 地址保留时长。
- 单位：天。
- 取值范围：0、1、2、3、7、15。

**说明**：设置原地址保留时长需最新版SDK，否则原地址将立即释放，查看SDK版本，请参见 [SDK中心](https://cloud.tencent.com/document/sdk)。
     * @param Recycle 原内网 IPv4 地址保留时长。
- 单位：天。
- 取值范围：0、1、2、3、7、15。

**说明**：设置原地址保留时长需最新版SDK，否则原地址将立即释放，查看SDK版本，请参见 [SDK中心](https://cloud.tencent.com/document/sdk)。
     */
    public void setRecycle(Long Recycle) {
        this.Recycle = Recycle;
    }

    /**
     * Get 指修改后的网络端口。当**Operation**为**changeVPort**或**changeVip**时，需配置该参数。取值范围为[1024,65535]。 
     * @return VPort 指修改后的网络端口。当**Operation**为**changeVPort**或**changeVip**时，需配置该参数。取值范围为[1024,65535]。
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 指修改后的网络端口。当**Operation**为**changeVPort**或**changeVip**时，需配置该参数。取值范围为[1024,65535]。
     * @param VPort 指修改后的网络端口。当**Operation**为**changeVPort**或**changeVip**时，需配置该参数。取值范围为[1024,65535]。
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    public ModifyNetworkConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkConfigRequest(ModifyNetworkConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Recycle != null) {
            this.Recycle = new Long(source.Recycle);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Recycle", this.Recycle);
        this.setParamSimple(map, prefix + "VPort", this.VPort);

    }
}

