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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineRegionsResponse extends AbstractModel{

    /**
    * CVM 云服务器地域列表
    */
    @SerializedName("CVM")
    @Expose
    private RegionInfo [] CVM;

    /**
    * BM 黑石机器地域列表
    */
    @SerializedName("BM")
    @Expose
    private RegionInfo [] BM;

    /**
    * LH 轻量应用服务器地域列表
    */
    @SerializedName("LH")
    @Expose
    private RegionInfo [] LH;

    /**
    * ECM 边缘计算服务器地域列表
    */
    @SerializedName("ECM")
    @Expose
    private RegionInfo [] ECM;

    /**
    * Other 混合云地域列表
    */
    @SerializedName("Other")
    @Expose
    private RegionInfo [] Other;

    /**
    * 所有地域列表(包含以上所有地域)
    */
    @SerializedName("ALL")
    @Expose
    private RegionInfo [] ALL;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CVM 云服务器地域列表 
     * @return CVM CVM 云服务器地域列表
     */
    public RegionInfo [] getCVM() {
        return this.CVM;
    }

    /**
     * Set CVM 云服务器地域列表
     * @param CVM CVM 云服务器地域列表
     */
    public void setCVM(RegionInfo [] CVM) {
        this.CVM = CVM;
    }

    /**
     * Get BM 黑石机器地域列表 
     * @return BM BM 黑石机器地域列表
     */
    public RegionInfo [] getBM() {
        return this.BM;
    }

    /**
     * Set BM 黑石机器地域列表
     * @param BM BM 黑石机器地域列表
     */
    public void setBM(RegionInfo [] BM) {
        this.BM = BM;
    }

    /**
     * Get LH 轻量应用服务器地域列表 
     * @return LH LH 轻量应用服务器地域列表
     */
    public RegionInfo [] getLH() {
        return this.LH;
    }

    /**
     * Set LH 轻量应用服务器地域列表
     * @param LH LH 轻量应用服务器地域列表
     */
    public void setLH(RegionInfo [] LH) {
        this.LH = LH;
    }

    /**
     * Get ECM 边缘计算服务器地域列表 
     * @return ECM ECM 边缘计算服务器地域列表
     */
    public RegionInfo [] getECM() {
        return this.ECM;
    }

    /**
     * Set ECM 边缘计算服务器地域列表
     * @param ECM ECM 边缘计算服务器地域列表
     */
    public void setECM(RegionInfo [] ECM) {
        this.ECM = ECM;
    }

    /**
     * Get Other 混合云地域列表 
     * @return Other Other 混合云地域列表
     */
    public RegionInfo [] getOther() {
        return this.Other;
    }

    /**
     * Set Other 混合云地域列表
     * @param Other Other 混合云地域列表
     */
    public void setOther(RegionInfo [] Other) {
        this.Other = Other;
    }

    /**
     * Get 所有地域列表(包含以上所有地域) 
     * @return ALL 所有地域列表(包含以上所有地域)
     */
    public RegionInfo [] getALL() {
        return this.ALL;
    }

    /**
     * Set 所有地域列表(包含以上所有地域)
     * @param ALL 所有地域列表(包含以上所有地域)
     */
    public void setALL(RegionInfo [] ALL) {
        this.ALL = ALL;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMachineRegionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineRegionsResponse(DescribeMachineRegionsResponse source) {
        if (source.CVM != null) {
            this.CVM = new RegionInfo[source.CVM.length];
            for (int i = 0; i < source.CVM.length; i++) {
                this.CVM[i] = new RegionInfo(source.CVM[i]);
            }
        }
        if (source.BM != null) {
            this.BM = new RegionInfo[source.BM.length];
            for (int i = 0; i < source.BM.length; i++) {
                this.BM[i] = new RegionInfo(source.BM[i]);
            }
        }
        if (source.LH != null) {
            this.LH = new RegionInfo[source.LH.length];
            for (int i = 0; i < source.LH.length; i++) {
                this.LH[i] = new RegionInfo(source.LH[i]);
            }
        }
        if (source.ECM != null) {
            this.ECM = new RegionInfo[source.ECM.length];
            for (int i = 0; i < source.ECM.length; i++) {
                this.ECM[i] = new RegionInfo(source.ECM[i]);
            }
        }
        if (source.Other != null) {
            this.Other = new RegionInfo[source.Other.length];
            for (int i = 0; i < source.Other.length; i++) {
                this.Other[i] = new RegionInfo(source.Other[i]);
            }
        }
        if (source.ALL != null) {
            this.ALL = new RegionInfo[source.ALL.length];
            for (int i = 0; i < source.ALL.length; i++) {
                this.ALL[i] = new RegionInfo(source.ALL[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CVM.", this.CVM);
        this.setParamArrayObj(map, prefix + "BM.", this.BM);
        this.setParamArrayObj(map, prefix + "LH.", this.LH);
        this.setParamArrayObj(map, prefix + "ECM.", this.ECM);
        this.setParamArrayObj(map, prefix + "Other.", this.Other);
        this.setParamArrayObj(map, prefix + "ALL.", this.ALL);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

