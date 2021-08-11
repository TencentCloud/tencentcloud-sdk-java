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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncContextResultRequest extends AbstractModel{

    /**
    * 异步检索任务ID
    */
    @SerializedName("AsyncContextTaskId")
    @Expose
    private String AsyncContextTaskId;

    /**
    * 日志包序号
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 日志在日志包内的序号
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 上文日志条数，默认值10
    */
    @SerializedName("PrevLogs")
    @Expose
    private Long PrevLogs;

    /**
    * 下文日志条数，默认值10
    */
    @SerializedName("NextLogs")
    @Expose
    private Long NextLogs;

    /**
     * Get 异步检索任务ID 
     * @return AsyncContextTaskId 异步检索任务ID
     */
    public String getAsyncContextTaskId() {
        return this.AsyncContextTaskId;
    }

    /**
     * Set 异步检索任务ID
     * @param AsyncContextTaskId 异步检索任务ID
     */
    public void setAsyncContextTaskId(String AsyncContextTaskId) {
        this.AsyncContextTaskId = AsyncContextTaskId;
    }

    /**
     * Get 日志包序号 
     * @return PkgId 日志包序号
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 日志包序号
     * @param PkgId 日志包序号
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 日志在日志包内的序号 
     * @return PkgLogId 日志在日志包内的序号
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 日志在日志包内的序号
     * @param PkgLogId 日志在日志包内的序号
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 上文日志条数，默认值10 
     * @return PrevLogs 上文日志条数，默认值10
     */
    public Long getPrevLogs() {
        return this.PrevLogs;
    }

    /**
     * Set 上文日志条数，默认值10
     * @param PrevLogs 上文日志条数，默认值10
     */
    public void setPrevLogs(Long PrevLogs) {
        this.PrevLogs = PrevLogs;
    }

    /**
     * Get 下文日志条数，默认值10 
     * @return NextLogs 下文日志条数，默认值10
     */
    public Long getNextLogs() {
        return this.NextLogs;
    }

    /**
     * Set 下文日志条数，默认值10
     * @param NextLogs 下文日志条数，默认值10
     */
    public void setNextLogs(Long NextLogs) {
        this.NextLogs = NextLogs;
    }

    public DescribeAsyncContextResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncContextResultRequest(DescribeAsyncContextResultRequest source) {
        if (source.AsyncContextTaskId != null) {
            this.AsyncContextTaskId = new String(source.AsyncContextTaskId);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.PrevLogs != null) {
            this.PrevLogs = new Long(source.PrevLogs);
        }
        if (source.NextLogs != null) {
            this.NextLogs = new Long(source.NextLogs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncContextTaskId", this.AsyncContextTaskId);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PrevLogs", this.PrevLogs);
        this.setParamSimple(map, prefix + "NextLogs", this.NextLogs);

    }
}

