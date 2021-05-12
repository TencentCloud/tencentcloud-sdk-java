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

public class DeliverStorageServiceRequest extends AbstractModel{

    /**
    * 待转移的源云存服务ID
    */
    @SerializedName("SrcServiceId")
    @Expose
    private String SrcServiceId;

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

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
     * Get 待转移的源云存服务ID 
     * @return SrcServiceId 待转移的源云存服务ID
     */
    public String getSrcServiceId() {
        return this.SrcServiceId;
    }

    /**
     * Set 待转移的源云存服务ID
     * @param SrcServiceId 待转移的源云存服务ID
     */
    public void setSrcServiceId(String SrcServiceId) {
        this.SrcServiceId = SrcServiceId;
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

    public DeliverStorageServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverStorageServiceRequest(DeliverStorageServiceRequest source) {
        if (source.SrcServiceId != null) {
            this.SrcServiceId = new String(source.SrcServiceId);
        }
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.ChnNum != null) {
            this.ChnNum = new Long(source.ChnNum);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcServiceId", this.SrcServiceId);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "ChnNum", this.ChnNum);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);

    }
}

