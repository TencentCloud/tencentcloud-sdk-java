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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineStrategyDetailResponse extends AbstractModel {

    /**
    * 策略扫描通过率
    */
    @SerializedName("PassRate")
    @Expose
    private Long PassRate;

    /**
    * 策略名
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 策略扫描周期(天)
    */
    @SerializedName("ScanCycle")
    @Expose
    private String ScanCycle;

    /**
    * 定期检测时间, 该时间下发扫描
    */
    @SerializedName("ScanAt")
    @Expose
    private String ScanAt;

    /**
    * 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 云服务器类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh: 轻量应用服务器
ohter: 混合云机器
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 主机地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用户该策略下的所有主机id
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 用户该策略下所有的基线id
    */
    @SerializedName("CategoryIds")
    @Expose
    private String [] CategoryIds;

    /**
    * 1 表示扫描过, 0没扫描过
    */
    @SerializedName("IfScanned")
    @Expose
    private Long IfScanned;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略扫描通过率 
     * @return PassRate 策略扫描通过率
     */
    public Long getPassRate() {
        return this.PassRate;
    }

    /**
     * Set 策略扫描通过率
     * @param PassRate 策略扫描通过率
     */
    public void setPassRate(Long PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get 策略名 
     * @return StrategyName 策略名
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名
     * @param StrategyName 策略名
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 策略扫描周期(天) 
     * @return ScanCycle 策略扫描周期(天)
     */
    public String getScanCycle() {
        return this.ScanCycle;
    }

    /**
     * Set 策略扫描周期(天)
     * @param ScanCycle 策略扫描周期(天)
     */
    public void setScanCycle(String ScanCycle) {
        this.ScanCycle = ScanCycle;
    }

    /**
     * Get 定期检测时间, 该时间下发扫描 
     * @return ScanAt 定期检测时间, 该时间下发扫描
     */
    public String getScanAt() {
        return this.ScanAt;
    }

    /**
     * Set 定期检测时间, 该时间下发扫描
     * @param ScanAt 定期检测时间, 该时间下发扫描
     */
    public void setScanAt(String ScanAt) {
        this.ScanAt = ScanAt;
    }

    /**
     * Get 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机 
     * @return IsGlobal 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
     * @param IsGlobal 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 云服务器类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh: 轻量应用服务器
ohter: 混合云机器 
     * @return MachineType 云服务器类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh: 轻量应用服务器
ohter: 混合云机器
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 云服务器类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh: 轻量应用服务器
ohter: 混合云机器
     * @param MachineType 云服务器类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh: 轻量应用服务器
ohter: 混合云机器
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 主机地域 
     * @return Region 主机地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 主机地域
     * @param Region 主机地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 用户该策略下的所有主机id 
     * @return Quuids 用户该策略下的所有主机id
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 用户该策略下的所有主机id
     * @param Quuids 用户该策略下的所有主机id
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 用户该策略下所有的基线id 
     * @return CategoryIds 用户该策略下所有的基线id
     */
    public String [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set 用户该策略下所有的基线id
     * @param CategoryIds 用户该策略下所有的基线id
     */
    public void setCategoryIds(String [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get 1 表示扫描过, 0没扫描过 
     * @return IfScanned 1 表示扫描过, 0没扫描过
     */
    public Long getIfScanned() {
        return this.IfScanned;
    }

    /**
     * Set 1 表示扫描过, 0没扫描过
     * @param IfScanned 1 表示扫描过, 0没扫描过
     */
    public void setIfScanned(Long IfScanned) {
        this.IfScanned = IfScanned;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBaselineStrategyDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineStrategyDetailResponse(DescribeBaselineStrategyDetailResponse source) {
        if (source.PassRate != null) {
            this.PassRate = new Long(source.PassRate);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.ScanCycle != null) {
            this.ScanCycle = new String(source.ScanCycle);
        }
        if (source.ScanAt != null) {
            this.ScanAt = new String(source.ScanAt);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new String[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new String(source.CategoryIds[i]);
            }
        }
        if (source.IfScanned != null) {
            this.IfScanned = new Long(source.IfScanned);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "ScanCycle", this.ScanCycle);
        this.setParamSimple(map, prefix + "ScanAt", this.ScanAt);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamSimple(map, prefix + "IfScanned", this.IfScanned);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

