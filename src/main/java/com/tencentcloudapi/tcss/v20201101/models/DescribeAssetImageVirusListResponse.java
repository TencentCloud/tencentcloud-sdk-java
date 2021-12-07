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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageVirusListResponse extends AbstractModel{

    /**
    * 镜像病毒列表
    */
    @SerializedName("List")
    @Expose
    private ImageVirusInfo [] List;

    /**
    * 总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 病毒扫描状态
0:未扫描
1:扫描中
2:扫描完成
3:扫描出错
4:扫描取消
    */
    @SerializedName("VirusScanStatus")
    @Expose
    private Long VirusScanStatus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像病毒列表 
     * @return List 镜像病毒列表
     */
    public ImageVirusInfo [] getList() {
        return this.List;
    }

    /**
     * Set 镜像病毒列表
     * @param List 镜像病毒列表
     */
    public void setList(ImageVirusInfo [] List) {
        this.List = List;
    }

    /**
     * Get 总数量 
     * @return TotalCount 总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
     * @param TotalCount 总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 病毒扫描状态
0:未扫描
1:扫描中
2:扫描完成
3:扫描出错
4:扫描取消 
     * @return VirusScanStatus 病毒扫描状态
0:未扫描
1:扫描中
2:扫描完成
3:扫描出错
4:扫描取消
     */
    public Long getVirusScanStatus() {
        return this.VirusScanStatus;
    }

    /**
     * Set 病毒扫描状态
0:未扫描
1:扫描中
2:扫描完成
3:扫描出错
4:扫描取消
     * @param VirusScanStatus 病毒扫描状态
0:未扫描
1:扫描中
2:扫描完成
3:扫描出错
4:扫描取消
     */
    public void setVirusScanStatus(Long VirusScanStatus) {
        this.VirusScanStatus = VirusScanStatus;
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

    public DescribeAssetImageVirusListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageVirusListResponse(DescribeAssetImageVirusListResponse source) {
        if (source.List != null) {
            this.List = new ImageVirusInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new ImageVirusInfo(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VirusScanStatus != null) {
            this.VirusScanStatus = new Long(source.VirusScanStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "VirusScanStatus", this.VirusScanStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

