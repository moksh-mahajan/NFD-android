/* -*- Mode:jde; c-file-style:"gnu"; indent-tabs-mode:nil; -*- */
/**
 * Copyright (c) 2015-2017 Regents of the University of California
 * <p>
 * This file is part of NFD (Named Data Networking Forwarding Daemon) Android.
 * See AUTHORS.md for complete list of NFD Android authors and contributors.
 * <p>
 * NFD Android is free software: you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p>
 * NFD Android is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along with
 * NFD Android, e.g., in COPYING.md file.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.named_data.nfd.wifidirect.callback;

import net.named_data.jndn.Face;
import net.named_data.jndn.Interest;
import net.named_data.jndn.InterestFilter;
import net.named_data.jndn.Name;

/**
 * Interface specification of a general callback
 * that takes in all input from a regular NDN OnInterest
 * callback, but fulfills a certain job.
 */
public interface NDNCallBackOnInterest {

  /**
   * Do something particular with available information onInterest.
   *
   * @param prefix           NDN Name
   * @param interest         NDN Interest
   * @param face             NDN Face
   * @param interestFilterId the interest filter ID
   * @param filter           the InterestFilter
   */
  public void doJob(Name prefix, Interest interest, Face face,
                    long interestFilterId, InterestFilter filter);
}
