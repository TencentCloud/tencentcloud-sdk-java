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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEventConfigRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>接收事件通知的方式。</p><li>PUSH：[HTTP 回调通知](https://cloud.tencent.com/document/product/266/33779)；</li><li>PULL：[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/33779)。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>采用 <a href="https://cloud.tencent.com/document/product/266/33779">HTTP 回调通知</a> 接收方式时，用于接收 3.0 格式回调的地址。<br>注意：如果带 NotificationUrl  参数且值为空字符串时将会清空 3.0 格式回调地址。</p>
    */
    @SerializedName("NotificationUrl")
    @Expose
    private String NotificationUrl;

    /**
    * <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/7830">视频上传完成</a> 事件通知， 默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
    */
    @SerializedName("UploadMediaCompleteEventSwitch")
    @Expose
    private String UploadMediaCompleteEventSwitch;

    /**
    * <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/13434">视频删除完成</a> 事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
    */
    @SerializedName("DeleteMediaCompleteEventSwitch")
    @Expose
    private String DeleteMediaCompleteEventSwitch;

    /**
    * <p>是否接收剪辑固化完成事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
    */
    @SerializedName("PersistenceCompleteEventSwitch")
    @Expose
    private String PersistenceCompleteEventSwitch;

    /**
    * <p>回调密钥，由大小写字母及数字组成，最长32字符。配置后将在回调中发送<code>Sign</code>与<code>T</code>字段，可用于鉴权。</p><ul><li><code>Sign</code>：string类型。事件通知安全签名 Sign = MD5（SignKey + T）。说明：腾讯云把加密 SignKey 和 T 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自腾讯云后台。</li><li><code>T</code>：int64类型。过期时间，事件通知签名过期 UNIX 时间戳。来自腾讯云的消息通知默认过期时间是10分钟，如果一条消息通知中的 t 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。T 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。</li></ul>
    */
    @SerializedName("SignKey")
    @Expose
    private String SignKey;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>接收事件通知的方式。</p><li>PUSH：[HTTP 回调通知](https://cloud.tencent.com/document/product/266/33779)；</li><li>PULL：[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/33779)。</li> 
     * @return Mode <p>接收事件通知的方式。</p><li>PUSH：[HTTP 回调通知](https://cloud.tencent.com/document/product/266/33779)；</li><li>PULL：[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/33779)。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>接收事件通知的方式。</p><li>PUSH：[HTTP 回调通知](https://cloud.tencent.com/document/product/266/33779)；</li><li>PULL：[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/33779)。</li>
     * @param Mode <p>接收事件通知的方式。</p><li>PUSH：[HTTP 回调通知](https://cloud.tencent.com/document/product/266/33779)；</li><li>PULL：[基于消息队列的可靠通知](https://cloud.tencent.com/document/product/266/33779)。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>采用 <a href="https://cloud.tencent.com/document/product/266/33779">HTTP 回调通知</a> 接收方式时，用于接收 3.0 格式回调的地址。<br>注意：如果带 NotificationUrl  参数且值为空字符串时将会清空 3.0 格式回调地址。</p> 
     * @return NotificationUrl <p>采用 <a href="https://cloud.tencent.com/document/product/266/33779">HTTP 回调通知</a> 接收方式时，用于接收 3.0 格式回调的地址。<br>注意：如果带 NotificationUrl  参数且值为空字符串时将会清空 3.0 格式回调地址。</p>
     */
    public String getNotificationUrl() {
        return this.NotificationUrl;
    }

    /**
     * Set <p>采用 <a href="https://cloud.tencent.com/document/product/266/33779">HTTP 回调通知</a> 接收方式时，用于接收 3.0 格式回调的地址。<br>注意：如果带 NotificationUrl  参数且值为空字符串时将会清空 3.0 格式回调地址。</p>
     * @param NotificationUrl <p>采用 <a href="https://cloud.tencent.com/document/product/266/33779">HTTP 回调通知</a> 接收方式时，用于接收 3.0 格式回调的地址。<br>注意：如果带 NotificationUrl  参数且值为空字符串时将会清空 3.0 格式回调地址。</p>
     */
    public void setNotificationUrl(String NotificationUrl) {
        this.NotificationUrl = NotificationUrl;
    }

    /**
     * Get <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/7830">视频上传完成</a> 事件通知， 默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p> 
     * @return UploadMediaCompleteEventSwitch <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/7830">视频上传完成</a> 事件通知， 默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     */
    public String getUploadMediaCompleteEventSwitch() {
        return this.UploadMediaCompleteEventSwitch;
    }

    /**
     * Set <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/7830">视频上传完成</a> 事件通知， 默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     * @param UploadMediaCompleteEventSwitch <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/7830">视频上传完成</a> 事件通知， 默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     */
    public void setUploadMediaCompleteEventSwitch(String UploadMediaCompleteEventSwitch) {
        this.UploadMediaCompleteEventSwitch = UploadMediaCompleteEventSwitch;
    }

    /**
     * Get <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/13434">视频删除完成</a> 事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p> 
     * @return DeleteMediaCompleteEventSwitch <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/13434">视频删除完成</a> 事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     */
    public String getDeleteMediaCompleteEventSwitch() {
        return this.DeleteMediaCompleteEventSwitch;
    }

    /**
     * Set <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/13434">视频删除完成</a> 事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     * @param DeleteMediaCompleteEventSwitch <p>是否接收 <a href="https://cloud.tencent.com/document/product/266/13434">视频删除完成</a> 事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     */
    public void setDeleteMediaCompleteEventSwitch(String DeleteMediaCompleteEventSwitch) {
        this.DeleteMediaCompleteEventSwitch = DeleteMediaCompleteEventSwitch;
    }

    /**
     * Get <p>是否接收剪辑固化完成事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p> 
     * @return PersistenceCompleteEventSwitch <p>是否接收剪辑固化完成事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     */
    public String getPersistenceCompleteEventSwitch() {
        return this.PersistenceCompleteEventSwitch;
    }

    /**
     * Set <p>是否接收剪辑固化完成事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     * @param PersistenceCompleteEventSwitch <p>是否接收剪辑固化完成事件通知，  默认 &quot;OFF&quot; 为忽略该事件通知，&quot;ON&quot; 为接收事件通知。</p>
     */
    public void setPersistenceCompleteEventSwitch(String PersistenceCompleteEventSwitch) {
        this.PersistenceCompleteEventSwitch = PersistenceCompleteEventSwitch;
    }

    /**
     * Get <p>回调密钥，由大小写字母及数字组成，最长32字符。配置后将在回调中发送<code>Sign</code>与<code>T</code>字段，可用于鉴权。</p><ul><li><code>Sign</code>：string类型。事件通知安全签名 Sign = MD5（SignKey + T）。说明：腾讯云把加密 SignKey 和 T 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自腾讯云后台。</li><li><code>T</code>：int64类型。过期时间，事件通知签名过期 UNIX 时间戳。来自腾讯云的消息通知默认过期时间是10分钟，如果一条消息通知中的 t 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。T 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。</li></ul> 
     * @return SignKey <p>回调密钥，由大小写字母及数字组成，最长32字符。配置后将在回调中发送<code>Sign</code>与<code>T</code>字段，可用于鉴权。</p><ul><li><code>Sign</code>：string类型。事件通知安全签名 Sign = MD5（SignKey + T）。说明：腾讯云把加密 SignKey 和 T 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自腾讯云后台。</li><li><code>T</code>：int64类型。过期时间，事件通知签名过期 UNIX 时间戳。来自腾讯云的消息通知默认过期时间是10分钟，如果一条消息通知中的 t 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。T 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。</li></ul>
     */
    public String getSignKey() {
        return this.SignKey;
    }

    /**
     * Set <p>回调密钥，由大小写字母及数字组成，最长32字符。配置后将在回调中发送<code>Sign</code>与<code>T</code>字段，可用于鉴权。</p><ul><li><code>Sign</code>：string类型。事件通知安全签名 Sign = MD5（SignKey + T）。说明：腾讯云把加密 SignKey 和 T 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自腾讯云后台。</li><li><code>T</code>：int64类型。过期时间，事件通知签名过期 UNIX 时间戳。来自腾讯云的消息通知默认过期时间是10分钟，如果一条消息通知中的 t 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。T 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。</li></ul>
     * @param SignKey <p>回调密钥，由大小写字母及数字组成，最长32字符。配置后将在回调中发送<code>Sign</code>与<code>T</code>字段，可用于鉴权。</p><ul><li><code>Sign</code>：string类型。事件通知安全签名 Sign = MD5（SignKey + T）。说明：腾讯云把加密 SignKey 和 T 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自腾讯云后台。</li><li><code>T</code>：int64类型。过期时间，事件通知签名过期 UNIX 时间戳。来自腾讯云的消息通知默认过期时间是10分钟，如果一条消息通知中的 t 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。T 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。</li></ul>
     */
    public void setSignKey(String SignKey) {
        this.SignKey = SignKey;
    }

    public ModifyEventConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEventConfigRequest(ModifyEventConfigRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
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
        if (source.SignKey != null) {
            this.SignKey = new String(source.SignKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "NotificationUrl", this.NotificationUrl);
        this.setParamSimple(map, prefix + "UploadMediaCompleteEventSwitch", this.UploadMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "DeleteMediaCompleteEventSwitch", this.DeleteMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "PersistenceCompleteEventSwitch", this.PersistenceCompleteEventSwitch);
        this.setParamSimple(map, prefix + "SignKey", this.SignKey);

    }
}

