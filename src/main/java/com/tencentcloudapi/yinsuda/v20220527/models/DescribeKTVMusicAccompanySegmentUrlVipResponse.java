/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVMusicAccompanySegmentUrlVipResponse extends AbstractModel {

    /**
    * 0:成功获取 1:歌曲下架 2:无权限 3: 非包月会员 4:没有对应的链接
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 伴奏链接

    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 伴奏类型，如mkv，mp3等

    */
    @SerializedName("ExtName")
    @Expose
    private String ExtName;

    /**
    * 高潮开始时间

    */
    @SerializedName("SegmentBegin")
    @Expose
    private Long SegmentBegin;

    /**
    * 高潮结束时间

    */
    @SerializedName("SegmentEnd")
    @Expose
    private Long SegmentEnd;

    /**
    * 链接文件大小 (单位:字节)

    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0:成功获取 1:歌曲下架 2:无权限 3: 非包月会员 4:没有对应的链接 
     * @return Status 0:成功获取 1:歌曲下架 2:无权限 3: 非包月会员 4:没有对应的链接
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0:成功获取 1:歌曲下架 2:无权限 3: 非包月会员 4:没有对应的链接
     * @param Status 0:成功获取 1:歌曲下架 2:无权限 3: 非包月会员 4:没有对应的链接
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 伴奏链接
 
     * @return Url 伴奏链接

     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 伴奏链接

     * @param Url 伴奏链接

     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 伴奏类型，如mkv，mp3等
 
     * @return ExtName 伴奏类型，如mkv，mp3等

     */
    public String getExtName() {
        return this.ExtName;
    }

    /**
     * Set 伴奏类型，如mkv，mp3等

     * @param ExtName 伴奏类型，如mkv，mp3等

     */
    public void setExtName(String ExtName) {
        this.ExtName = ExtName;
    }

    /**
     * Get 高潮开始时间
 
     * @return SegmentBegin 高潮开始时间

     */
    public Long getSegmentBegin() {
        return this.SegmentBegin;
    }

    /**
     * Set 高潮开始时间

     * @param SegmentBegin 高潮开始时间

     */
    public void setSegmentBegin(Long SegmentBegin) {
        this.SegmentBegin = SegmentBegin;
    }

    /**
     * Get 高潮结束时间
 
     * @return SegmentEnd 高潮结束时间

     */
    public Long getSegmentEnd() {
        return this.SegmentEnd;
    }

    /**
     * Set 高潮结束时间

     * @param SegmentEnd 高潮结束时间

     */
    public void setSegmentEnd(Long SegmentEnd) {
        this.SegmentEnd = SegmentEnd;
    }

    /**
     * Get 链接文件大小 (单位:字节)
 
     * @return FileSize 链接文件大小 (单位:字节)

     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 链接文件大小 (单位:字节)

     * @param FileSize 链接文件大小 (单位:字节)

     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
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

    public DescribeKTVMusicAccompanySegmentUrlVipResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVMusicAccompanySegmentUrlVipResponse(DescribeKTVMusicAccompanySegmentUrlVipResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ExtName != null) {
            this.ExtName = new String(source.ExtName);
        }
        if (source.SegmentBegin != null) {
            this.SegmentBegin = new Long(source.SegmentBegin);
        }
        if (source.SegmentEnd != null) {
            this.SegmentEnd = new Long(source.SegmentEnd);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ExtName", this.ExtName);
        this.setParamSimple(map, prefix + "SegmentBegin", this.SegmentBegin);
        this.setParamSimple(map, prefix + "SegmentEnd", this.SegmentEnd);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

