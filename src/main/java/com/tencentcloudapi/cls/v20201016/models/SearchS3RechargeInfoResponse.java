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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchS3RechargeInfoResponse extends AbstractModel {

    /**
    * <p>匹配到的存储桶下的某个文件的前几行数据</p>
    */
    @SerializedName("Data")
    @Expose
    private String [] Data;

    /**
    * <p>匹配到的存储桶下的文件个数</p>
    */
    @SerializedName("Sum")
    @Expose
    private Long Sum;

    /**
    * <p>当前预览文件路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>预览获取数据失败原因</p>
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * <p>状态。</p><ul><li>0：成功</li><li>10000：参数错误，请确认参数</li><li>10001：授权失败，请确认授权</li><li>10002：获取文件列表失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式</li><li>10004：文件下载失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10005：文件解压缩失败，请选择正确的压缩方式然后再试</li><li>10006：读取文件内容失败，请确认文件可读</li><li>10007：文件预览失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>匹配到的存储桶下的某个文件的前几行数据</p> 
     * @return Data <p>匹配到的存储桶下的某个文件的前几行数据</p>
     */
    public String [] getData() {
        return this.Data;
    }

    /**
     * Set <p>匹配到的存储桶下的某个文件的前几行数据</p>
     * @param Data <p>匹配到的存储桶下的某个文件的前几行数据</p>
     */
    public void setData(String [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>匹配到的存储桶下的文件个数</p> 
     * @return Sum <p>匹配到的存储桶下的文件个数</p>
     */
    public Long getSum() {
        return this.Sum;
    }

    /**
     * Set <p>匹配到的存储桶下的文件个数</p>
     * @param Sum <p>匹配到的存储桶下的文件个数</p>
     */
    public void setSum(Long Sum) {
        this.Sum = Sum;
    }

    /**
     * Get <p>当前预览文件路径</p> 
     * @return Path <p>当前预览文件路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>当前预览文件路径</p>
     * @param Path <p>当前预览文件路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>预览获取数据失败原因</p> 
     * @return Msg <p>预览获取数据失败原因</p>
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set <p>预览获取数据失败原因</p>
     * @param Msg <p>预览获取数据失败原因</p>
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get <p>状态。</p><ul><li>0：成功</li><li>10000：参数错误，请确认参数</li><li>10001：授权失败，请确认授权</li><li>10002：获取文件列表失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式</li><li>10004：文件下载失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10005：文件解压缩失败，请选择正确的压缩方式然后再试</li><li>10006：读取文件内容失败，请确认文件可读</li><li>10007：文件预览失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li></ul> 
     * @return Status <p>状态。</p><ul><li>0：成功</li><li>10000：参数错误，请确认参数</li><li>10001：授权失败，请确认授权</li><li>10002：获取文件列表失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式</li><li>10004：文件下载失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10005：文件解压缩失败，请选择正确的压缩方式然后再试</li><li>10006：读取文件内容失败，请确认文件可读</li><li>10007：文件预览失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。</p><ul><li>0：成功</li><li>10000：参数错误，请确认参数</li><li>10001：授权失败，请确认授权</li><li>10002：获取文件列表失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式</li><li>10004：文件下载失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10005：文件解压缩失败，请选择正确的压缩方式然后再试</li><li>10006：读取文件内容失败，请确认文件可读</li><li>10007：文件预览失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li></ul>
     * @param Status <p>状态。</p><ul><li>0：成功</li><li>10000：参数错误，请确认参数</li><li>10001：授权失败，请确认授权</li><li>10002：获取文件列表失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式</li><li>10004：文件下载失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li><li>10005：文件解压缩失败，请选择正确的压缩方式然后再试</li><li>10006：读取文件内容失败，请确认文件可读</li><li>10007：文件预览失败，请稍后再试。若无法解决，请咨询 <a href="https://cloud.tencent.com/online-service">在线支持</a> 或 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=83&amp;level2_id=469&amp;source=14&amp;data_title=%E6%97%A5%E5%BF%97%E6%9C%8D%E5%8A%A1&amp;step=1">提交工单</a> 处理。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public SearchS3RechargeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchS3RechargeInfoResponse(SearchS3RechargeInfoResponse source) {
        if (source.Data != null) {
            this.Data = new String[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new String(source.Data[i]);
            }
        }
        if (source.Sum != null) {
            this.Sum = new Long(source.Sum);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Sum", this.Sum);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

