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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditImageCreateDetail extends AbstractModel {

    /**
    * 图片上传状态，0 表示成功，其他表示失败。
10101: url 解码失败。
10102: url 解析失败。
10103: url 不是 cos 地址。
10301: label 不合法。
20101: 数据入库错误。
30101: cos 下载图片连接错误。
30102: cos 下载图片响应错误。
40101: 优图接口调用错误。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 上传的图片 Id。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 图片上传顺序索引。
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
     * Get 图片上传状态，0 表示成功，其他表示失败。
10101: url 解码失败。
10102: url 解析失败。
10103: url 不是 cos 地址。
10301: label 不合法。
20101: 数据入库错误。
30101: cos 下载图片连接错误。
30102: cos 下载图片响应错误。
40101: 优图接口调用错误。 
     * @return Status 图片上传状态，0 表示成功，其他表示失败。
10101: url 解码失败。
10102: url 解析失败。
10103: url 不是 cos 地址。
10301: label 不合法。
20101: 数据入库错误。
30101: cos 下载图片连接错误。
30102: cos 下载图片响应错误。
40101: 优图接口调用错误。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 图片上传状态，0 表示成功，其他表示失败。
10101: url 解码失败。
10102: url 解析失败。
10103: url 不是 cos 地址。
10301: label 不合法。
20101: 数据入库错误。
30101: cos 下载图片连接错误。
30102: cos 下载图片响应错误。
40101: 优图接口调用错误。
     * @param Status 图片上传状态，0 表示成功，其他表示失败。
10101: url 解码失败。
10102: url 解析失败。
10103: url 不是 cos 地址。
10301: label 不合法。
20101: 数据入库错误。
30101: cos 下载图片连接错误。
30102: cos 下载图片响应错误。
40101: 优图接口调用错误。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 上传的图片 Id。 
     * @return ImageId 上传的图片 Id。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 上传的图片 Id。
     * @param ImageId 上传的图片 Id。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 图片上传顺序索引。 
     * @return Index 图片上传顺序索引。
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 图片上传顺序索引。
     * @param Index 图片上传顺序索引。
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    public AuditImageCreateDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditImageCreateDetail(AuditImageCreateDetail source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

