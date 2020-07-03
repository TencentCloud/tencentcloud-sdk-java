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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemDisk extends AbstractModel{

    /**
    * 系统盘类型。系统盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><br>默认取值：CLOUD_BASIC。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 系统盘ID。LOCAL_BASIC 和 LOCAL_SSD 类型没有ID。暂时不支持该参数。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 系统盘大小，单位：GB。默认值为 50
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get 系统盘类型。系统盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><br>默认取值：CLOUD_BASIC。 
     * @return DiskType 系统盘类型。系统盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><br>默认取值：CLOUD_BASIC。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 系统盘类型。系统盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><br>默认取值：CLOUD_BASIC。
     * @param DiskType 系统盘类型。系统盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><br>默认取值：CLOUD_BASIC。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 系统盘ID。LOCAL_BASIC 和 LOCAL_SSD 类型没有ID。暂时不支持该参数。 
     * @return DiskId 系统盘ID。LOCAL_BASIC 和 LOCAL_SSD 类型没有ID。暂时不支持该参数。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 系统盘ID。LOCAL_BASIC 和 LOCAL_SSD 类型没有ID。暂时不支持该参数。
     * @param DiskId 系统盘ID。LOCAL_BASIC 和 LOCAL_SSD 类型没有ID。暂时不支持该参数。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 系统盘大小，单位：GB。默认值为 50 
     * @return DiskSize 系统盘大小，单位：GB。默认值为 50
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 系统盘大小，单位：GB。默认值为 50
     * @param DiskSize 系统盘大小，单位：GB。默认值为 50
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

