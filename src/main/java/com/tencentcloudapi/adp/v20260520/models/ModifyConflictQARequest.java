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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConflictQARequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>冲突组 ID（全局忽略时可不传）</p>
    */
    @SerializedName("ConflictGroupId")
    @Expose
    private String ConflictGroupId;

    /**
    * <p>是否全局忽略（忽略当前KB下所有待处理冲突问）</p>
    */
    @SerializedName("IsIgnoreAll")
    @Expose
    private Boolean IsIgnoreAll;

    /**
    * <p>决策涉及的 QA ID 列表（KEEP 与 DELETE 必填）</p>
    */
    @SerializedName("QaIdList")
    @Expose
    private String [] QaIdList;

    /**
    * <p>冲突解决策略：1=保留，2=忽略，3=删除（全局忽略时可不传）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>保留</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>忽略</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>删除</td></tr><tr><td>CONFLICT_RESOLUTION_MERGE</td><td>4</td><td>合并</td></tr><tr><td>CONFLICT_RESOLUTION_REPLACE</td><td>5</td><td>替换</td></tr><tr><td>CONFLICT_RESOLUTION_RENAME</td><td>6</td><td>重命名</td></tr></tbody></table></p>
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>冲突组 ID（全局忽略时可不传）</p> 
     * @return ConflictGroupId <p>冲突组 ID（全局忽略时可不传）</p>
     */
    public String getConflictGroupId() {
        return this.ConflictGroupId;
    }

    /**
     * Set <p>冲突组 ID（全局忽略时可不传）</p>
     * @param ConflictGroupId <p>冲突组 ID（全局忽略时可不传）</p>
     */
    public void setConflictGroupId(String ConflictGroupId) {
        this.ConflictGroupId = ConflictGroupId;
    }

    /**
     * Get <p>是否全局忽略（忽略当前KB下所有待处理冲突问）</p> 
     * @return IsIgnoreAll <p>是否全局忽略（忽略当前KB下所有待处理冲突问）</p>
     */
    public Boolean getIsIgnoreAll() {
        return this.IsIgnoreAll;
    }

    /**
     * Set <p>是否全局忽略（忽略当前KB下所有待处理冲突问）</p>
     * @param IsIgnoreAll <p>是否全局忽略（忽略当前KB下所有待处理冲突问）</p>
     */
    public void setIsIgnoreAll(Boolean IsIgnoreAll) {
        this.IsIgnoreAll = IsIgnoreAll;
    }

    /**
     * Get <p>决策涉及的 QA ID 列表（KEEP 与 DELETE 必填）</p> 
     * @return QaIdList <p>决策涉及的 QA ID 列表（KEEP 与 DELETE 必填）</p>
     */
    public String [] getQaIdList() {
        return this.QaIdList;
    }

    /**
     * Set <p>决策涉及的 QA ID 列表（KEEP 与 DELETE 必填）</p>
     * @param QaIdList <p>决策涉及的 QA ID 列表（KEEP 与 DELETE 必填）</p>
     */
    public void setQaIdList(String [] QaIdList) {
        this.QaIdList = QaIdList;
    }

    /**
     * Get <p>冲突解决策略：1=保留，2=忽略，3=删除（全局忽略时可不传）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>保留</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>忽略</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>删除</td></tr><tr><td>CONFLICT_RESOLUTION_MERGE</td><td>4</td><td>合并</td></tr><tr><td>CONFLICT_RESOLUTION_REPLACE</td><td>5</td><td>替换</td></tr><tr><td>CONFLICT_RESOLUTION_RENAME</td><td>6</td><td>重命名</td></tr></tbody></table></p> 
     * @return Resolution <p>冲突解决策略：1=保留，2=忽略，3=删除（全局忽略时可不传）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>保留</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>忽略</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>删除</td></tr><tr><td>CONFLICT_RESOLUTION_MERGE</td><td>4</td><td>合并</td></tr><tr><td>CONFLICT_RESOLUTION_REPLACE</td><td>5</td><td>替换</td></tr><tr><td>CONFLICT_RESOLUTION_RENAME</td><td>6</td><td>重命名</td></tr></tbody></table></p>
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>冲突解决策略：1=保留，2=忽略，3=删除（全局忽略时可不传）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>保留</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>忽略</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>删除</td></tr><tr><td>CONFLICT_RESOLUTION_MERGE</td><td>4</td><td>合并</td></tr><tr><td>CONFLICT_RESOLUTION_REPLACE</td><td>5</td><td>替换</td></tr><tr><td>CONFLICT_RESOLUTION_RENAME</td><td>6</td><td>重命名</td></tr></tbody></table></p>
     * @param Resolution <p>冲突解决策略：1=保留，2=忽略，3=删除（全局忽略时可不传）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONFLICT_RESOLUTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CONFLICT_RESOLUTION_KEEP</td><td>1</td><td>保留</td></tr><tr><td>CONFLICT_RESOLUTION_IGNORE</td><td>2</td><td>忽略</td></tr><tr><td>CONFLICT_RESOLUTION_DELETE</td><td>3</td><td>删除</td></tr><tr><td>CONFLICT_RESOLUTION_MERGE</td><td>4</td><td>合并</td></tr><tr><td>CONFLICT_RESOLUTION_REPLACE</td><td>5</td><td>替换</td></tr><tr><td>CONFLICT_RESOLUTION_RENAME</td><td>6</td><td>重命名</td></tr></tbody></table></p>
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    public ModifyConflictQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConflictQARequest(ModifyConflictQARequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.ConflictGroupId != null) {
            this.ConflictGroupId = new String(source.ConflictGroupId);
        }
        if (source.IsIgnoreAll != null) {
            this.IsIgnoreAll = new Boolean(source.IsIgnoreAll);
        }
        if (source.QaIdList != null) {
            this.QaIdList = new String[source.QaIdList.length];
            for (int i = 0; i < source.QaIdList.length; i++) {
                this.QaIdList[i] = new String(source.QaIdList[i]);
            }
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "ConflictGroupId", this.ConflictGroupId);
        this.setParamSimple(map, prefix + "IsIgnoreAll", this.IsIgnoreAll);
        this.setParamArraySimple(map, prefix + "QaIdList.", this.QaIdList);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

