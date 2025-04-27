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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventConfigResponse extends AbstractModel {

    /**
    * 接收事件通知的方式。"PUSH" 为 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83)，"PULL" 为 [可靠回调](https://cloud.tencent.com/document/product/266/33779#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83)。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 采用 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83) 模式时，用于接收 V3 版本事件通知的地址。
    */
    @SerializedName("NotificationUrl")
    @Expose
    private String NotificationUrl;

    /**
    * 是否接收 [视频上传完成](https://cloud.tencent.com/document/product/266/7830) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("UploadMediaCompleteEventSwitch")
    @Expose
    private String UploadMediaCompleteEventSwitch;

    /**
    * 是否接收 [视频删除完成](https://cloud.tencent.com/document/product/266/13434) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("DeleteMediaCompleteEventSwitch")
    @Expose
    private String DeleteMediaCompleteEventSwitch;

    /**
    * 是否接收剪辑固化完成事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
    */
    @SerializedName("PersistenceCompleteEventSwitch")
    @Expose
    private String PersistenceCompleteEventSwitch;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 接收事件通知的方式。"PUSH" 为 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83)，"PULL" 为 [可靠回调](https://cloud.tencent.com/document/product/266/33779#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83)。 
     * @return Mode 接收事件通知的方式。"PUSH" 为 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83)，"PULL" 为 [可靠回调](https://cloud.tencent.com/document/product/266/33779#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83)。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 接收事件通知的方式。"PUSH" 为 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83)，"PULL" 为 [可靠回调](https://cloud.tencent.com/document/product/266/33779#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83)。
     * @param Mode 接收事件通知的方式。"PUSH" 为 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83)，"PULL" 为 [可靠回调](https://cloud.tencent.com/document/product/266/33779#.E5.8F.AF.E9.9D.A0.E5.9B.9E.E8.B0.83)。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 采用 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83) 模式时，用于接收 V3 版本事件通知的地址。 
     * @return NotificationUrl 采用 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83) 模式时，用于接收 V3 版本事件通知的地址。
     */
    public String getNotificationUrl() {
        return this.NotificationUrl;
    }

    /**
     * Set 采用 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83) 模式时，用于接收 V3 版本事件通知的地址。
     * @param NotificationUrl 采用 [普通回调](https://cloud.tencent.com/document/product/266/33779#.E6.99.AE.E9.80.9A.E5.9B.9E.E8.B0.83) 模式时，用于接收 V3 版本事件通知的地址。
     */
    public void setNotificationUrl(String NotificationUrl) {
        this.NotificationUrl = NotificationUrl;
    }

    /**
     * Get 是否接收 [视频上传完成](https://cloud.tencent.com/document/product/266/7830) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return UploadMediaCompleteEventSwitch 是否接收 [视频上传完成](https://cloud.tencent.com/document/product/266/7830) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getUploadMediaCompleteEventSwitch() {
        return this.UploadMediaCompleteEventSwitch;
    }

    /**
     * Set 是否接收 [视频上传完成](https://cloud.tencent.com/document/product/266/7830) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param UploadMediaCompleteEventSwitch 是否接收 [视频上传完成](https://cloud.tencent.com/document/product/266/7830) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setUploadMediaCompleteEventSwitch(String UploadMediaCompleteEventSwitch) {
        this.UploadMediaCompleteEventSwitch = UploadMediaCompleteEventSwitch;
    }

    /**
     * Get 是否接收 [视频删除完成](https://cloud.tencent.com/document/product/266/13434) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return DeleteMediaCompleteEventSwitch 是否接收 [视频删除完成](https://cloud.tencent.com/document/product/266/13434) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getDeleteMediaCompleteEventSwitch() {
        return this.DeleteMediaCompleteEventSwitch;
    }

    /**
     * Set 是否接收 [视频删除完成](https://cloud.tencent.com/document/product/266/13434) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param DeleteMediaCompleteEventSwitch 是否接收 [视频删除完成](https://cloud.tencent.com/document/product/266/13434) 事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setDeleteMediaCompleteEventSwitch(String DeleteMediaCompleteEventSwitch) {
        this.DeleteMediaCompleteEventSwitch = DeleteMediaCompleteEventSwitch;
    }

    /**
     * Get 是否接收剪辑固化完成事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。 
     * @return PersistenceCompleteEventSwitch 是否接收剪辑固化完成事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public String getPersistenceCompleteEventSwitch() {
        return this.PersistenceCompleteEventSwitch;
    }

    /**
     * Set 是否接收剪辑固化完成事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     * @param PersistenceCompleteEventSwitch 是否接收剪辑固化完成事件通知，"OFF" 为忽略该事件通知，"ON" 为接收事件通知。
     */
    public void setPersistenceCompleteEventSwitch(String PersistenceCompleteEventSwitch) {
        this.PersistenceCompleteEventSwitch = PersistenceCompleteEventSwitch;
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

    public DescribeEventConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventConfigResponse(DescribeEventConfigResponse source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.NotificationUrl != null) {
            this.NotificationUrl = new String(source.NotificationUrl);
        }
        if (source.UploadMediaCompleteEventSwitch != null) {
            this.UploadMediaCompleteEventSwitch = new String(source.UploadMediaCompleteEventSwitch);
        }
        if (source.DeleteMediaCompleteEventSwitch != null) {
            this.DeleteMediaCompleteEventSwitch = new String(source.DeleteMediaCompleteEventSwitch);
        }
        if (source.PersistenceCompleteEventSwitch != null) {
            this.PersistenceCompleteEventSwitch = new String(source.PersistenceCompleteEventSwitch);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "NotificationUrl", this.NotificationUrl);
        this.setParamSimple(map, prefix + "UploadMediaCompleteEventSwitch", this.UploadMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "DeleteMediaCompleteEventSwitch", this.DeleteMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "PersistenceCompleteEventSwitch", this.PersistenceCompleteEventSwitch);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

