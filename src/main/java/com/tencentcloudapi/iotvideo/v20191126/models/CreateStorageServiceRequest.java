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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStorageServiceRequest extends AbstractModel{

    /**
    * 云存套餐ID：
yc1m3d ： 全时3天存储月套餐。
yc1m7d ： 全时7天存储月套餐。
yc1m30d ：全时30天存储月套餐。
yc1y3d ：全时3天存储年套餐。
yc1y7d ：全时7天存储年套餐。
yc1y30d ：全时30天存储年套餐。
ye1m3d ：事件3天存储月套餐。
ye1m7d ：事件7天存储月套餐。
ye1m30d ：事件30天存储月套餐 。
ye1y3d ：事件3天存储年套餐。
ye1y7d ：事件7天存储年套餐。
ye1y30d ：事件30天存储年套餐。
yc1w7d : 全时7天存储周套餐。
ye1w7d : 事件7天存储周套餐。
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 订单数量,可一次性创建多个订单
    */
    @SerializedName("OrderCount")
    @Expose
    private Long OrderCount;

    /**
    * 云存服务所在的区域,如ap-guangzhou,ap-singapore, na-siliconvalley, eu-frankfurt
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
    */
    @SerializedName("ChnNum")
    @Expose
    private Long ChnNum;

    /**
    * 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 服务生效时间,若不指定此参数，服务立即生效
    */
    @SerializedName("EnableTime")
    @Expose
    private Long EnableTime;

    /**
     * Get 云存套餐ID：
yc1m3d ： 全时3天存储月套餐。
yc1m7d ： 全时7天存储月套餐。
yc1m30d ：全时30天存储月套餐。
yc1y3d ：全时3天存储年套餐。
yc1y7d ：全时7天存储年套餐。
yc1y30d ：全时30天存储年套餐。
ye1m3d ：事件3天存储月套餐。
ye1m7d ：事件7天存储月套餐。
ye1m30d ：事件30天存储月套餐 。
ye1y3d ：事件3天存储年套餐。
ye1y7d ：事件7天存储年套餐。
ye1y30d ：事件30天存储年套餐。
yc1w7d : 全时7天存储周套餐。
ye1w7d : 事件7天存储周套餐。 
     * @return PkgId 云存套餐ID：
yc1m3d ： 全时3天存储月套餐。
yc1m7d ： 全时7天存储月套餐。
yc1m30d ：全时30天存储月套餐。
yc1y3d ：全时3天存储年套餐。
yc1y7d ：全时7天存储年套餐。
yc1y30d ：全时30天存储年套餐。
ye1m3d ：事件3天存储月套餐。
ye1m7d ：事件7天存储月套餐。
ye1m30d ：事件30天存储月套餐 。
ye1y3d ：事件3天存储年套餐。
ye1y7d ：事件7天存储年套餐。
ye1y30d ：事件30天存储年套餐。
yc1w7d : 全时7天存储周套餐。
ye1w7d : 事件7天存储周套餐。
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 云存套餐ID：
yc1m3d ： 全时3天存储月套餐。
yc1m7d ： 全时7天存储月套餐。
yc1m30d ：全时30天存储月套餐。
yc1y3d ：全时3天存储年套餐。
yc1y7d ：全时7天存储年套餐。
yc1y30d ：全时30天存储年套餐。
ye1m3d ：事件3天存储月套餐。
ye1m7d ：事件7天存储月套餐。
ye1m30d ：事件30天存储月套餐 。
ye1y3d ：事件3天存储年套餐。
ye1y7d ：事件7天存储年套餐。
ye1y30d ：事件30天存储年套餐。
yc1w7d : 全时7天存储周套餐。
ye1w7d : 事件7天存储周套餐。
     * @param PkgId 云存套餐ID：
yc1m3d ： 全时3天存储月套餐。
yc1m7d ： 全时7天存储月套餐。
yc1m30d ：全时30天存储月套餐。
yc1y3d ：全时3天存储年套餐。
yc1y7d ：全时7天存储年套餐。
yc1y30d ：全时30天存储年套餐。
ye1m3d ：事件3天存储月套餐。
ye1m7d ：事件7天存储月套餐。
ye1m30d ：事件30天存储月套餐 。
ye1y3d ：事件3天存储年套餐。
ye1y7d ：事件7天存储年套餐。
ye1y30d ：事件30天存储年套餐。
yc1w7d : 全时7天存储周套餐。
ye1w7d : 事件7天存储周套餐。
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 订单数量,可一次性创建多个订单 
     * @return OrderCount 订单数量,可一次性创建多个订单
     */
    public Long getOrderCount() {
        return this.OrderCount;
    }

    /**
     * Set 订单数量,可一次性创建多个订单
     * @param OrderCount 订单数量,可一次性创建多个订单
     */
    public void setOrderCount(Long OrderCount) {
        this.OrderCount = OrderCount;
    }

    /**
     * Get 云存服务所在的区域,如ap-guangzhou,ap-singapore, na-siliconvalley, eu-frankfurt 
     * @return StorageRegion 云存服务所在的区域,如ap-guangzhou,ap-singapore, na-siliconvalley, eu-frankfurt
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 云存服务所在的区域,如ap-guangzhou,ap-singapore, na-siliconvalley, eu-frankfurt
     * @param StorageRegion 云存服务所在的区域,如ap-guangzhou,ap-singapore, na-siliconvalley, eu-frankfurt
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应) 
     * @return ChnNum 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
     */
    public Long getChnNum() {
        return this.ChnNum;
    }

    /**
     * Set 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
     * @param ChnNum 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
     */
    public void setChnNum(Long ChnNum) {
        this.ChnNum = ChnNum;
    }

    /**
     * Get 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致 
     * @return AccessId 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致
     * @param AccessId 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 服务生效时间,若不指定此参数，服务立即生效 
     * @return EnableTime 服务生效时间,若不指定此参数，服务立即生效
     */
    public Long getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set 服务生效时间,若不指定此参数，服务立即生效
     * @param EnableTime 服务生效时间,若不指定此参数，服务立即生效
     */
    public void setEnableTime(Long EnableTime) {
        this.EnableTime = EnableTime;
    }

    public CreateStorageServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStorageServiceRequest(CreateStorageServiceRequest source) {
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.OrderCount != null) {
            this.OrderCount = new Long(source.OrderCount);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.ChnNum != null) {
            this.ChnNum = new Long(source.ChnNum);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.EnableTime != null) {
            this.EnableTime = new Long(source.EnableTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "OrderCount", this.OrderCount);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ChnNum", this.ChnNum);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);

    }
}

