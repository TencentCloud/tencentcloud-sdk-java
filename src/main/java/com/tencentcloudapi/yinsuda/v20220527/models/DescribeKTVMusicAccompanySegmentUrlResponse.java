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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVMusicAccompanySegmentUrlResponse extends AbstractModel{

    /**
    * 歌曲状态。
0：可用
1：下线
2：没权限
3：没伴奏
当返回2时，其他参数有可能全部为空
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
    * 链接文件大小 单位 字节
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 其它片段时间（可用于抢唱）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherSegments")
    @Expose
    private KTVOtherSegments [] OtherSegments;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 歌曲状态。
0：可用
1：下线
2：没权限
3：没伴奏
当返回2时，其他参数有可能全部为空 
     * @return Status 歌曲状态。
0：可用
1：下线
2：没权限
3：没伴奏
当返回2时，其他参数有可能全部为空
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 歌曲状态。
0：可用
1：下线
2：没权限
3：没伴奏
当返回2时，其他参数有可能全部为空
     * @param Status 歌曲状态。
0：可用
1：下线
2：没权限
3：没伴奏
当返回2时，其他参数有可能全部为空
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
     * Get 链接文件大小 单位 字节 
     * @return FileSize 链接文件大小 单位 字节
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 链接文件大小 单位 字节
     * @param FileSize 链接文件大小 单位 字节
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 其它片段时间（可用于抢唱）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherSegments 其它片段时间（可用于抢唱）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KTVOtherSegments [] getOtherSegments() {
        return this.OtherSegments;
    }

    /**
     * Set 其它片段时间（可用于抢唱）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherSegments 其它片段时间（可用于抢唱）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherSegments(KTVOtherSegments [] OtherSegments) {
        this.OtherSegments = OtherSegments;
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

    public DescribeKTVMusicAccompanySegmentUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVMusicAccompanySegmentUrlResponse(DescribeKTVMusicAccompanySegmentUrlResponse source) {
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
        if (source.OtherSegments != null) {
            this.OtherSegments = new KTVOtherSegments[source.OtherSegments.length];
            for (int i = 0; i < source.OtherSegments.length; i++) {
                this.OtherSegments[i] = new KTVOtherSegments(source.OtherSegments[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ExtName", this.ExtName);
        this.setParamSimple(map, prefix + "SegmentBegin", this.SegmentBegin);
        this.setParamSimple(map, prefix + "SegmentEnd", this.SegmentEnd);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamArrayObj(map, prefix + "OtherSegments.", this.OtherSegments);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

