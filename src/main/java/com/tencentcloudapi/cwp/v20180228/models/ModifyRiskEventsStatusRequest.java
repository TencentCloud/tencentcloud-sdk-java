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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRiskEventsStatusRequest extends AbstractModel {

    /**
    * 操作-0:标记已处理,1:忽略,2:删除记录,3:木马隔离,4:木马恢复隔离,5:木马信任,6:木马取消信任,7:查杀异常进程,8:加入白名单
    */
    @SerializedName("Operate")
    @Expose
    private Long Operate;

    /**
    * 操作事件类型，文件查杀：MALWARE，异常登录：HOST_LOGIN，密码破解：BRUTE_ATTACK，恶意请求：MALICIOUS_REQUEST，高危命令：BASH_EVENT，本地提权：PRIVILEGE_EVENT，反弹shell：REVERSE_SHELL. 异常进程:PROCESS
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 需要修改的事件id 数组，支持批量
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
    */
    @SerializedName("UpdateAll")
    @Expose
    private Boolean UpdateAll;

    /**
    * 排除的事件id,当操作全部事件时，需要排除这次id
    */
    @SerializedName("ExcludeId")
    @Expose
    private Long [] ExcludeId;

    /**
    * 当Operate 是木马隔离时，表示是否要杀进程，其他操作无效
    */
    @SerializedName("KillProcess")
    @Expose
    private Boolean KillProcess;

    /**
    * 当RiskType 为异地登录且ids为空时，可以修改所有来源ip的事件的状态
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * 过滤条件。RiskType为 MALWARE时
1、当RiskType为 MALWARE时：
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
RiskType 为PROCESS时:
过滤条件。
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中;2已查杀3已退出;4已信任</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 当Operate 是木马隔离时
<li> 本操作会修复被篡改的系统命令，计划任务等系统文件，操作中请确保yum/apt 可用。</li>
    */
    @SerializedName("DoClean")
    @Expose
    private Boolean DoClean;

    /**
     * Get 操作-0:标记已处理,1:忽略,2:删除记录,3:木马隔离,4:木马恢复隔离,5:木马信任,6:木马取消信任,7:查杀异常进程,8:加入白名单 
     * @return Operate 操作-0:标记已处理,1:忽略,2:删除记录,3:木马隔离,4:木马恢复隔离,5:木马信任,6:木马取消信任,7:查杀异常进程,8:加入白名单
     */
    public Long getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作-0:标记已处理,1:忽略,2:删除记录,3:木马隔离,4:木马恢复隔离,5:木马信任,6:木马取消信任,7:查杀异常进程,8:加入白名单
     * @param Operate 操作-0:标记已处理,1:忽略,2:删除记录,3:木马隔离,4:木马恢复隔离,5:木马信任,6:木马取消信任,7:查杀异常进程,8:加入白名单
     */
    public void setOperate(Long Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 操作事件类型，文件查杀：MALWARE，异常登录：HOST_LOGIN，密码破解：BRUTE_ATTACK，恶意请求：MALICIOUS_REQUEST，高危命令：BASH_EVENT，本地提权：PRIVILEGE_EVENT，反弹shell：REVERSE_SHELL. 异常进程:PROCESS 
     * @return RiskType 操作事件类型，文件查杀：MALWARE，异常登录：HOST_LOGIN，密码破解：BRUTE_ATTACK，恶意请求：MALICIOUS_REQUEST，高危命令：BASH_EVENT，本地提权：PRIVILEGE_EVENT，反弹shell：REVERSE_SHELL. 异常进程:PROCESS
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 操作事件类型，文件查杀：MALWARE，异常登录：HOST_LOGIN，密码破解：BRUTE_ATTACK，恶意请求：MALICIOUS_REQUEST，高危命令：BASH_EVENT，本地提权：PRIVILEGE_EVENT，反弹shell：REVERSE_SHELL. 异常进程:PROCESS
     * @param RiskType 操作事件类型，文件查杀：MALWARE，异常登录：HOST_LOGIN，密码破解：BRUTE_ATTACK，恶意请求：MALICIOUS_REQUEST，高危命令：BASH_EVENT，本地提权：PRIVILEGE_EVENT，反弹shell：REVERSE_SHELL. 异常进程:PROCESS
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 需要修改的事件id 数组，支持批量 
     * @return Ids 需要修改的事件id 数组，支持批量
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 需要修改的事件id 数组，支持批量
     * @param Ids 需要修改的事件id 数组，支持批量
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效 
     * @return UpdateAll 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     */
    public Boolean getUpdateAll() {
        return this.UpdateAll;
    }

    /**
     * Set 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     * @param UpdateAll 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     */
    public void setUpdateAll(Boolean UpdateAll) {
        this.UpdateAll = UpdateAll;
    }

    /**
     * Get 排除的事件id,当操作全部事件时，需要排除这次id 
     * @return ExcludeId 排除的事件id,当操作全部事件时，需要排除这次id
     */
    public Long [] getExcludeId() {
        return this.ExcludeId;
    }

    /**
     * Set 排除的事件id,当操作全部事件时，需要排除这次id
     * @param ExcludeId 排除的事件id,当操作全部事件时，需要排除这次id
     */
    public void setExcludeId(Long [] ExcludeId) {
        this.ExcludeId = ExcludeId;
    }

    /**
     * Get 当Operate 是木马隔离时，表示是否要杀进程，其他操作无效 
     * @return KillProcess 当Operate 是木马隔离时，表示是否要杀进程，其他操作无效
     */
    public Boolean getKillProcess() {
        return this.KillProcess;
    }

    /**
     * Set 当Operate 是木马隔离时，表示是否要杀进程，其他操作无效
     * @param KillProcess 当Operate 是木马隔离时，表示是否要杀进程，其他操作无效
     */
    public void setKillProcess(Boolean KillProcess) {
        this.KillProcess = KillProcess;
    }

    /**
     * Get 当RiskType 为异地登录且ids为空时，可以修改所有来源ip的事件的状态 
     * @return Ip 当RiskType 为异地登录且ids为空时，可以修改所有来源ip的事件的状态
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set 当RiskType 为异地登录且ids为空时，可以修改所有来源ip的事件的状态
     * @param Ip 当RiskType 为异地登录且ids为空时，可以修改所有来源ip的事件的状态
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 过滤条件。RiskType为 MALWARE时
1、当RiskType为 MALWARE时：
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
RiskType 为PROCESS时:
过滤条件。
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中;2已查杀3已退出;4已信任</li> 
     * @return Filters 过滤条件。RiskType为 MALWARE时
1、当RiskType为 MALWARE时：
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
RiskType 为PROCESS时:
过滤条件。
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中;2已查杀3已退出;4已信任</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。RiskType为 MALWARE时
1、当RiskType为 MALWARE时：
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
RiskType 为PROCESS时:
过滤条件。
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中;2已查杀3已退出;4已信任</li>
     * @param Filters 过滤条件。RiskType为 MALWARE时
1、当RiskType为 MALWARE时：
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
RiskType 为PROCESS时:
过滤条件。
<li>IpOrName - String - 是否必填：否 - 主机IP或主机名</li>
<li>VirusName - String - 是否必填：否 - 病毒名</li>
<li>BeginTime - String - 是否必填：否 - 进程启动时间-开始</li>
<li>EndTime - String - 是否必填：否 - 进程启动时间-结束</li>
<li>Status - String - 是否必填：否 - 状态筛选 0待处理；1查杀中;2已查杀3已退出;4已信任</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 当Operate 是木马隔离时
<li> 本操作会修复被篡改的系统命令，计划任务等系统文件，操作中请确保yum/apt 可用。</li> 
     * @return DoClean 当Operate 是木马隔离时
<li> 本操作会修复被篡改的系统命令，计划任务等系统文件，操作中请确保yum/apt 可用。</li>
     */
    public Boolean getDoClean() {
        return this.DoClean;
    }

    /**
     * Set 当Operate 是木马隔离时
<li> 本操作会修复被篡改的系统命令，计划任务等系统文件，操作中请确保yum/apt 可用。</li>
     * @param DoClean 当Operate 是木马隔离时
<li> 本操作会修复被篡改的系统命令，计划任务等系统文件，操作中请确保yum/apt 可用。</li>
     */
    public void setDoClean(Boolean DoClean) {
        this.DoClean = DoClean;
    }

    public ModifyRiskEventsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskEventsStatusRequest(ModifyRiskEventsStatusRequest source) {
        if (source.Operate != null) {
            this.Operate = new Long(source.Operate);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.UpdateAll != null) {
            this.UpdateAll = new Boolean(source.UpdateAll);
        }
        if (source.ExcludeId != null) {
            this.ExcludeId = new Long[source.ExcludeId.length];
            for (int i = 0; i < source.ExcludeId.length; i++) {
                this.ExcludeId[i] = new Long(source.ExcludeId[i]);
            }
        }
        if (source.KillProcess != null) {
            this.KillProcess = new Boolean(source.KillProcess);
        }
        if (source.Ip != null) {
            this.Ip = new String[source.Ip.length];
            for (int i = 0; i < source.Ip.length; i++) {
                this.Ip[i] = new String(source.Ip[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.DoClean != null) {
            this.DoClean = new Boolean(source.DoClean);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "UpdateAll", this.UpdateAll);
        this.setParamArraySimple(map, prefix + "ExcludeId.", this.ExcludeId);
        this.setParamSimple(map, prefix + "KillProcess", this.KillProcess);
        this.setParamArraySimple(map, prefix + "Ip.", this.Ip);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DoClean", this.DoClean);

    }
}

